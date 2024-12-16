import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class RectangularGAmeObject extends GameObject implements Collidable {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public RectangularGAmeObject(Shape shape, double x, double y, Color color) {
        super(shape, x, y, color);
    }
    public boolean collideWith (Ball ball) {
        return collideleft(ball) || collideright(ball) || collideup(ball) || collidebottom(ball);
    }
    public boolean collideleft (Ball ball) {
        return getX() == ball.getX()+ball.getRadius();
    }
    public boolean collideright (Ball ball){
        return getX()+getWidth()==ball.getX()- ball.getRadius();
    }
    public boolean collideup (Ball ball) {
        return getY() == ball.getY()+ ball.getRadius();
    }
    public boolean collidebottom (Ball ball) {
        return getY()+getHeight()== ball.getY()- ball.getRadius();
    }
}
