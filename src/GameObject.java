import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class GameObject {
    protected Shape shape ;
    protected double x, y ;
    private Color color ;

    public GameObject(Shape shape, double x , double y , Color color){
        setShape(shape);
        setX(x);
        setY(y);
        setColor(color);
    }
    public Shape getShape(){ //Il n'y as pas besoin que cette méthode recoit un attribut car c'est un getter
        return this.shape;

    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getX() {
        return this.x;
    }

    public abstract void setX(double x);



    public double getY() {
        return this.y;
    }

    public abstract void setY(double y) ;



    public Color getColor() {
        return this.color;

    }

    public void setColor(Color color) {
        this.color = color;
        this.shape.setFill(color);
    }



}