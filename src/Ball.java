import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Ball extends GameObject {
    private double vx, vy;
    private double radius;
    private static Color DEFAUT_COLOR = Color.BLUE;

    public Ball( double x, double y,double radius , double vx , double vy) {
        super(new Circle(x,y,radius), x, y, DEFAUT_COLOR);
        setVx(vx);
        setVy(vy);
        setRadius(radius);
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public double getRadius() {
        return this.radius;
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
        this.x = x;
        ((Circle)this.shape).setCenterX(x);

    }

    @Override
    public void setY(double y) {
        this.y = y;
        ((Circle)this.shape).setCenterY(y);

    }

    @Override
    public Circle getShape() {
        return (Circle) this.shape;
    }


public void switchVx() {
    this.vx = -this.vx;
}

public void switchVy() {
    this.vy = -this.vy;
}

public void move() {
    setX(getX() + vx);
    setY(getY() + vy);
}

}