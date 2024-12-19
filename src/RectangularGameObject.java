import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class RectangularGameObject extends GameObject implements Collidable {
    private double width;
    private double height;

    public RectangularGameObject(double width, double height, double x, double y, Color color) {
        super(new Rectangle(width, height,x,y), x, y, color);
    }

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

    @Override
    public void setX(double x) {
        this.x = x;
        ((Rectangle)this.shape).setX(x);

    }

    @Override
    public void setY(double y) {
        this.y = y;
        ((Rectangle)this.shape).setY(y);


    }

    @Override
    public Rectangle getShape() {
        return (Rectangle) this.shape;
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

    public void onCollisionWith(Ball ball) {
        if (collideleft(ball)||collideright(ball)) {
            ball.switchVx();
        }
        if (collideup(ball)||collidebottom(ball)) {
            ball.switchVy();
        }

    }
}
