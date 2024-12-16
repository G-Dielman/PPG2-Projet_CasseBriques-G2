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

public class                                                                        JavaFX extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //création du Pane
        Pane root = new Pane();
        Scene scene = new Scene(root,600,800);
        primaryStage.setTitle("BrickBreak");
        primaryStage.setScene(scene);
        primaryStage.show();

        //création du rectangle

        Rectangle rec1 = new Rectangle();
        Paddle pad = new Paddle(25,100,100,750);
        Rectangle rec = new Rectangle(pad.getPosition().getX(),pad.getPosition().getY(),pad.getTaille().getLargeur(),pad.getTaille().getHauteur());
        rec.setFill(Color.BLUE);
        root.getChildren().add(rec);

        //Création de la balle

        //Ball ball1 = new Ball(10,10,5,75,75);
        //Circle circ1 = new Circle(ball1.getPosition().getX(),ball1.getPosition().getY(),ball1.getRayon());
       // circ1.setFill(Color.BLACK);
       // root.getChildren().add(circ1);

        //création des mouvement fait par le joueur
        scene.setOnKeyPressed(event ->{
            switch (event.getCode()) {
                case LEFT:
                    System.out.println();
                    if (rec.getX()>=0) {
                        rec.setX(rec.getX() - 30);
                        pad.setPosition(pad.getPosition().getX() - 30, pad.getPosition().getY());
                    }
                    break;
                case RIGHT:
                    if (rec.getX()<= 600-pad.getTaille().getLargeur()) {
                        System.out.println();
                        rec.setX(rec.getX() + 30);
                    }
                    break;


            }});

        //lancement du mouvement de la balle

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                ball1.move(600,800);
                circ1.setCenterX(circ1.getCenterX() + ball1.getVitesseX());
                circ1.setCenterY(circ1.getCenterY() + ball1.getVitesseY());
            }
        };
        timer.start();

    }
    public static void main(String[] args){
        launch(args);
    }
}
