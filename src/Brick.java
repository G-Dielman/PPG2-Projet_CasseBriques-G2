public class Brick {
    //Déclaration variables (position x et y, état, taille)
    private double posX, posY;
    private boolean state;
    private double ver, hor;
    //Constructeur
    public Brick(int posX, int posY,boolean state,int ver,int hor){
        this.posX = posX;
        this.posY = posY;
        this.state = state;
        this.ver = ver;
        this.hor = hor;
    }
    // Méthodes get x, y, état
    public double getX(){return posX;}
    public double getY(){return posY;}
    public boolean getState(){return state;}
    public double getVer(){return ver;}
    public double getHor(){return hor;}


    //Méthodes set x, y, état
    public void setX(double x){this.posX = x;}
    public void setY(double y){this.posY = y;}
    public void setState(boolean state){this.state = state;}

}
