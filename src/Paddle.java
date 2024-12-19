import javafx.scene.paint.Color;

public class Paddle extends RectangularGameObject {

    private static final Color DEFAULT_COLOR = Color.PURPLE;

    public Paddle(double x, double y, double width, double height) {
        super( x, y ,width,height, DEFAULT_COLOR);

    }

}