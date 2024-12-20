import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.util.Random;


import java.lang.reflect.Array;

public class JavaFX extends Application{
    AnimationTimer timer;
    public Brick[] createBricks(Pane root, Scene scene){
        Random r = new Random();
        int nbrbrique = 20;
        double space = 5;
        double taillebrique =scene.getWidth()/5 - space;

        Brick[] bricks = new Brick[nbrbrique];
        for (int row = 0; row <= bricks.length/5 ; row++) {
            for (int colum = 0; colum < 5 && row * 5 + colum < bricks.length; colum++) {
                int idx = row * 5 + colum;
                int x = r.nextInt(1,3);
                if (x == 1){
                    bricks[idx] = new SolidBrick(colum*taillebrique+colum*space+space/2,10+(row*taillebrique),taillebrique,taillebrique);
                    root.getChildren().add(bricks[idx].shape);
                }
                else {
                    bricks[idx] = new NormalBrick(colum*taillebrique+colum*space+space/2,10+(row*taillebrique),taillebrique,taillebrique);
                    root.getChildren().add(bricks[idx].shape);
                }
            }
        }
        return bricks;
    }

    private void stopGame(String message, Pane root) {
        timer.stop();;
        Label endMessage = new Label(message);
        endMessage.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        endMessage.setTextFill(Color.INDIANRED);
        endMessage.setTextAlignment(TextAlignment.CENTER);
        // Centrer le Label dans la fenêtre
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(endMessage);
        stackPane.setPrefSize(root.getWidth(), root.getHeight());
        stackPane.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);"); // Fond semi-transparent
        root.getChildren().add(stackPane);

    }
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 700);
        // Création de la balle et de la raquette
        Ball ball = new Ball(scene.getWidth()/2, scene.getHeight()-100, 5.5, 2, 2);
        Paddle paddle = new Paddle(scene.getWidth()/2, scene.getHeight()-50 , 100, 20);
        // Ajouter les formes au pane
        root.getChildren().addAll(ball.getShape() , paddle.getShape());
        // Création et affichage des briques. Les briques sont ajoutées au Pane par la fonction et
        // leurs tailles varie en fonction des dimenssions de la scene
        Brick[] bricks = createBricks(root, scene);
        //Déplacement de la raquette
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT:
                    // Empêche de dépasser le bord gauche
                    paddle.setX(Math.max(0, paddle.getX() - 15));
                    break;
                case RIGHT:
                    // Empêche de dépasser le bord droit
                    paddle.setX(Math.min(scene.getWidth() - paddle.getWidth(), paddle.getX() + 15));
                    break;
            }
        });
        // AnimationTimer pour déplacer la balle
        this.timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ball.move(); // Met à jour la position de la balle
                // Rebondir sur les bords de la fenêtre
                if (ball.getX()- ball.getRadius() <= 0 // Si la balle touche le mur de gauche
                        || ball.getX() + ball.getRadius() >= scene.getWidth()) // ou le mur de Droite
                    ball.switchVx(); // Inverser la direction horizontale
                if (ball.getY() - ball.getRadius() <= 0) // Si la balle touche le plafont
                    ball.switchVy(); // Inverser la direction verticale
                // Vérifier si la balle tombe sous la raquette
                if (ball.getY() > scene.getHeight()) {
                    stopGame("Game Over!", root);
                }
                // Collision avec la raquette
                if ( paddle.collideWith(ball) ) {
                    paddle.onCollisionWith(ball);
                }
                // Collision avec les briques
                boolean allBrickBroken = true;
                for (Brick brick : bricks){
                    if ( !brick.isBroken() ){
                        allBrickBroken = false;
                        if ( brick.collideWith(ball) )
                            brick.onCollisionWith(ball);
                    }
                }
                //Si toutes les briques sont brisées, le joueur a gagné
                if(allBrickBroken)
                    stopGame("YOU WIN !!!", root);
            }
        };
        this.timer.start(); // Démarrer l'animation

        primaryStage.setTitle("Casse-briques - Itération 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
