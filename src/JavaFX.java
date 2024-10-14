import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFX extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage stage){
        HBox hbox = new HBox(10); // 10 pixels d'espacement entre les éléments

        Scene scene = new Scene(hbox, 300, 100);
        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();


    }
}
