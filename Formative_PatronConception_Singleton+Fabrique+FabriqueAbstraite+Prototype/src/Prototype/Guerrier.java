package Prototype;

public abstract class Guerrier implements Cloneable{
    String couleur_Cheveux;
    double taille;
    int poids;
    String specialisation;

    abstract void attack();

    public void setCouleur_Cheveux(String couleur_Cheveux) {
        this.couleur_Cheveux = couleur_Cheveux;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getCouleur_Cheveux() {
        return couleur_Cheveux;
    }

    public double getTaille() {
        return taille;
    }

    public int getPoids() {
        return poids;
    }
    
    public String getSpecialisation() {
        return specialisation;
    }

    public Guerrier clone() {
        try{
            Guerrier copie = (Guerrier) super.clone();
            return copie;
        }catch(CloneNotSupportedException e) {
            return null;
        }
    }

}
