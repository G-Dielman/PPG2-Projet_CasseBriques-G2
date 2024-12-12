import java.awt.*;

public abstract class GameObject {
    private Shape shape ;
    private double x, y ;
    private Color color ;

    public GameObject(Shape shape, double x , double y , Color color){
        setShape(shape);
        setX(x);
        setY(y);
        SetColor(color);
    }

}
