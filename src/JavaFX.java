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
        //HBox hbox = new HBox(10); // 10 pixels d'espacement entre les éléments
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 540, 500);
        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();

        //Rectangle rect = new Rectangle(0,0 ,100,100);
        Brick[] tabBricks= new Brick[50];
        for(int layer= 0 ;layer <5; ++layer) {
            int x = 0;
            for (int cpt = 0; cpt < 7; ++cpt) {
                Brick brick = new Brick(1+x, 40 * layer, true, 80, 50);
                Rectangle Brick1 = new Rectangle(brick.getX(), brick.getY(), brick.getVer(), brick.getHor());
                pane.getChildren().add(Brick1);
                tabBricks[cpt] = brick;
                int clr = 0;
                Brick1.setStroke(Color.BLACK);

                // CHiffre random pour définir une couleur aléatoire

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
    }
}
