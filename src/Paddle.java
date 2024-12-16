import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Paddle extends RectangularGAmeObject {

    private static final Color DEFAULT_COLOR = Color.PURPLE;

    public Paddle(double x, double y, double width, double height) {
        super( x, y ,width,height, DEFAULT_COLOR);

    }

}