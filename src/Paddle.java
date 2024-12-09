public class Paddle {
    private Position pospaddle = new Position(50,0);
    private Taille padd = new Taille(50,50);
    public Paddle(double x, double y) {
        setPosition(x,y);
    }
    public Paddle(double hauteur, double largeur, double x, double y) {
        setTaille(largeur,hauteur);
        setPosition(x,y);
    }
    public Position getPosition() {
        return pospaddle;
    }
    public Taille getTaille() {return padd;}
    public void setPosition (double positionx, double positiony) {
        this.pospaddle.setX(positionx);
        this.pospaddle.setY(positiony);
    }
    public void setTaille (double largeur, double hauteur) {
        this.padd.setLargeur(largeur);
        this.padd.setHauteur(hauteur);
    }


}
