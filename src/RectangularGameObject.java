import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class RectangularGameObject extends GameObject implements Collidable {
    private double width;
    private double height;

    public RectangularGameObject(double x, double y,double width, double height,  Color color) {
        super(new Rectangle(x,y,width, height), x, y, color);
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
        return ball.getX() + ball.getRadius() == getX() ; //emplacement 5 avec la taille max 10 et emplacement de la balle 7
    }
    public boolean collideright (Ball ball){
        return ball.getX() - ball.getRadius() == getX()+getWidth()   ;
    }
    public boolean collideup (Ball ball) {
        return ball.getY() + ball.getRadius() == getY()  ;
    }
    public boolean collidebottom (Ball ball) {
        return ball.getY() - ball.getRadius() == getY()+getHeight()  ;
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
