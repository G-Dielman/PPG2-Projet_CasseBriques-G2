import javafx.scene.paint.Color;

public class SolidBrick extends Brick{
    private int hits;
    public static Color DEFAUT_COLOR=Color.DARKGREEN;
    public SolidBrick(double x, double y, double width, double height) {
        super(x, y, width, height, DEFAUT_COLOR);
        this.hits =0;
    }

    @Override
    public void onCollisionWith(Ball ball) {
        super.onCollisionWith(ball);
        hits++;
        if (hits==1) {
            setColor(Color.GREEN);
        }
        else if (hits==2) {
            setColor(Color.GREENYELLOW);
        }
        else if (hits==3) {
            breakThis();
        }
    }
}
