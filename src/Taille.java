public class Taille {
    private double largeur, hauteur;
    public Taille(double x, double y) {
        setHauteur(y);
        setLargeur(x);
    }
    public double getLargeur(){
        return largeur;
    }
    public double getHauteur(){
        return hauteur;
    }
    public void setLargeur(double x){
        if (x <0 || x> 200){
            throw new RuntimeException("Largeur non compatible");
        }
        else
            this.largeur = x;
    }

    public void setHauteur(double y){
        if(y<0 || y> 200) {
          throw new RuntimeException("Hauteur non conforme");
        }
        else
            this.hauteur = y;
    }
}
