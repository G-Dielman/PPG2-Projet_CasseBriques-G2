public class Racquette {

    private double x, y;
    //Accesseurs de "x"
    public double getX(){
        return x;
    }
    public void setX( double valDeX ){// methode de Getter et Setters (modifier la position x de la raquette)
        this.x = x;
    }

    private double racquette = 100; // taille de la raquette en pixel

    //Accesseurs de "raquette"
    public double getRacquette() {
        return racquette;

    }
    public void setRacquette(double racquette) {
        this.racquette = racquette;
    }
}
