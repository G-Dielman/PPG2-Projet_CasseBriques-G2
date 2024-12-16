import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class Ball extends GameObject {
    private double vx, vy;
    private double radius;
    private static Color DEFAUT_COLOR = Color.BLUE;

    public Ball(double radius , double x, double y, double vx , double vy) {
        super(new Circle(x,y,radius), x, y, DEFAUT_COLOR);
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public double getRadius() {
        return radius;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }


    @Override
    public void setX(double x) {


    }

    @Override
    public void setY(double y) {

    }

    @Override
    public Shape getShape() {
        return new Circle(getX(),getY(),getRadius());
    }

}