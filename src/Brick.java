public class Brick {
    //Déclaration variables (position x et y, état)
    private double posX, posY;
    private boolean state;

    // Méthodes get x, y, état
    public double getX(){return posX;}
    public double getY(){return posY;}
    public boolean getState(){return state;}

    //Méthodes set x, y, état
    public void setX(double x){this.posX = x;}
    public void setY(double y){this.posY = y;}
    public void setState(boolean state){this.state = state;}

}
