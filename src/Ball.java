public class Ball {
    private double vitesseX, vitesseY, rayon;
    private Position posBalle = new Position(50,0); //position par défaut

    public Position getPosition() {
        return posBalle;
    }

    public double getVitesseX() {
        return vitesseX;
    }
    public double getVitesseY(){
        return vitesseY;
    }

    public double getRayon() {
        return rayon;
    }

    public void setPosition(double x, double y) {
        this.posBalle.setX(x);
        this.posBalle.setY(y);
    }

    public void setVitesseX(double vitesseX) {
        if (vitesseX == 0){
            throw new RuntimeException("Vitesse de la balle en X ne peut pas être null");
        }
        else
            this.vitesseX = vitesseX;
    }
    public void setVitesseY(double vitesseY) {
        if (vitesseY == 0){
            throw new RuntimeException("Vitesse de la balle en Y ne peut pas être null");
        }
        else
            this.vitesseY = vitesseY;
    }

    public void setRayon(double rayon) {
        if (rayon < 0 || rayon > 100){
            throw new RuntimeException("Taille de balle non conforme");
        }
        else
            this.rayon = rayon;
    }
    public Ball(double vitesseX, double vitesseY, double rayon, double x, double y){
        setVitesseX(vitesseX);
        setVitesseY(vitesseY);
        setRayon(rayon);
        setPosition(x,y);
    }
    public Ball(double vitesseX, double vitesseY){
        setVitesseX(vitesseX);
        setVitesseY(vitesseY);
    }
    public void move(double x , double y){ //Methode pour les déplacement de ball et ses repond
        this.posBalle.setX(this.posBalle.getX() + vitesseX);
        this.posBalle.setY(this.posBalle.getY() + vitesseY);
        if (this.posBalle.getX()>= x || this.posBalle.getX() <= 0){ //rebondis si collision en X
            changeVitesseX();
        }
        if (this.posBalle.getY()>= y || this.posBalle.getY() <= 0){ //rebondis si collision en Y
            changeVitesseY();
        }

    }
    //méthode de changement de vitesse
    public void changeVitesseX (){
        this.vitesseX = -this.vitesseX;
    }
    public void changeVitesseY (){
        this.vitesseY = -this.vitesseY;
    }

}
