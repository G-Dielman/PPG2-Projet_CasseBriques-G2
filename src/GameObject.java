import java.awt.*;

public abstract class GameObject {
    private Shape shape ;
    private double x, y ;
    private Color color ;

    public GameObject(Shape shape, double x , double y , Color color){
        setShape(shape);
        setX(x);
        setY(y);
        setColor(color);
    }
    public Shape getShape(Shape shape){ //Il n'y as pas besoin que cette méthode recoit un attribut car c'est un getter
        return shape;

    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getX() {
        return x;
    }

    public abstract void setX(double x);



    public double getY() {
        return y;
    }

    public abstract void setY(double y) ;



    public Color getColor() {
        return color;

    }

    public void setColor(Color color) {
        this.color = color;
        this.shape.setFill(color);
    }

    public abstract Shape getShape();



}