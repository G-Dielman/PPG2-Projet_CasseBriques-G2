import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;

import java.awt.*;
import java.lang.reflect.Array;

public class JavaFX extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage stage){
       // création Pane
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 480, 400);
        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();

        //Création+affichage BALLE
        Balle ball = new Balle(240, 300,1,-1,10);
        Circle boule = new Circle(ball.getX(),ball.getY(),10);
        pane.getChildren().add(boule);

        // création+affichage briques (5 couches de 6 briques en longueur) + couleurs
        Brick[] tabBricks= new Brick[50];
        for(int layer= 0 ;layer <5; ++layer) {
            int x = 0;
            for (int cpt = 0; cpt < 6; ++cpt) {
                Brick brick = new Brick(1+x, 50 * layer, true, 50, 80);
                Rectangle Brick1 = new Rectangle(brick.getX(), brick.getY(), brick.getVer(), brick.getHor());
                pane.getChildren().add(Brick1);
                tabBricks[cpt] = brick;
                Brick1.setStroke(Color.BLACK);
                // Chiffre random pour définir une couleur aléatoire
                Random rdm = new Random();
                int randomNum = rdm.nextInt(1,5);
                if (randomNum == 1){
                    Brick1.setFill(Color.GRAY);
                }
                if (randomNum ==2 ){
                    Brick1.setFill(Color.RED);
                }
                if (randomNum ==3 ){
                    Brick1.setFill(Color.BLUE);
                }
                if (randomNum ==4 ){
                    Brick1.setFill(Color.YELLOW);
                }
                if (randomNum ==5 ){
                    Brick1.setFill(Color.GREEN);
                }
                x += 80 ;

            }
        }
        // Animation Balle
        AnimationTimer timer = new AnimationTimer() {

            @Override


            public void handle(long now) {

                boule.setCenterX(ball.getX());
                boule.setCenterY(ball.getY());

                // Rebondir lorsque le cercle atteint les bords droites/gauche
                if (boule.getCenterX() - boule.getRadius() <= 0 || boule.getCenterX() + boule.getRadius() >= 480) {
                    ball.setVX(ball.getVX() * -1);
                }
                if (boule.getCenterY() - boule.getRadius() <= 0 || boule.getCenterY() + boule.getRadius() >= 400) {
                    ball.setVY(ball.getVY() * -1);
                }
                ball.move();

            }
        };
        timer.start();


    }
}
