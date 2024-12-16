public abstract class Brick extends RectangularGAmeObject{
    //tout peut être supprimmé
    private Taille heightbrick;
    private boolean broken = false;
    private Taille brick = new Taille(20,20);

    public Brick(double x, double y) {
        setHeightbrick(x,y);
    }
    public Taille getHeightbrick() {
        return heightbrick;
    }
    public void setHeightbrick(double x, double y) {
        this.heightbrick.setLargeur(x);
        this.heightbrick.setHauteur(y);
    }
    //changement des valeur boolean des briques
    public boolean isBroken() {return broken;}

    public void setBroken(boolean broken) {this.broken = broken;}
    public void breakthis() {

    }

}

