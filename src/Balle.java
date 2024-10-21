public class Balle {

    private double x, y , vx, vy ,taille;

    //Constructeur
    public Balle(double x, double y, double vx, double vy, double size){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.taille = size;
    }
    //getter
    public double getX(){return x;}
    public double getY(){return y;}
    public double getVX(){return vx;}
    public double getVY(){return vy;}


    //setter
    public void setX(double newX){this.x = newX;}
    public void setY(double newY){this.y = newY;}
    public void setVX(double newVX){this.vx = newVX;}
    public void setVY(double newVY){this.vy = newVY;}


    //Méthode move qui déplace la balle
    public void move(){
        this.x += this.vx;
       this.y += this.vy;
    }
}