import javafx.scene.paint.Color;

public class NormalBrick extends Brick{
    public static Color DEFAUT_COLOR=Color.GREENYELLOW;
    public NormalBrick(double x, double y, double width, double height) {
        super(x, y, width, height,DEFAUT_COLOR );
    }

    @Override
    public void onCollisionWith(Ball ball) {
        super.onCollisionWith(ball);
        breakThis();
    }
}
