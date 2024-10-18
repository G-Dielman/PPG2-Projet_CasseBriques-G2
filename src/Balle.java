public class Balle {



    private double x, y , vx, vy ,taille;



    //Constructeur

    public Balle(int x, int y, int vx, int vy, int size){

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

    public void setX(int newX){this.x = newX;}

    public void setY(int newY){this.y = newY;}

    public void setVX(int newVX){this.vx = newVX;}

    public void setVY(int newVY){this.vy = newVY;}





    //Méthodes

    public void move(){

        x += vx;

        y += vy;

    }

}
