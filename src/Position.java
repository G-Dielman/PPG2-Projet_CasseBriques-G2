public class Position { //Classe pour mettre la poisition des objets
    private double x,y;

    public Position(double x, double y){
        setX(x);
        setY(y);
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x){this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

}