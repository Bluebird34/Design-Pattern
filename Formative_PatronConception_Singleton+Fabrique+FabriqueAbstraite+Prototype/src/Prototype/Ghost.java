package Prototype;

public class Ghost extends Guerrier{

    Guerrier unGuerrier; //DI

    public Ghost(String couleur_Cheveux,double taille,int poids) {
        this.unGuerrier = super.clone();
        this.unGuerrier.setCouleur_Cheveux(couleur_Cheveux);
        this.unGuerrier.setTaille(taille);
        this.unGuerrier.setPoids(poids);
        this.unGuerrier.setSpecialisation("ghost");
    }

    @Override
    void attack() {
        System.out.println("I can spat the fire");
    }

    @Override
    public String toString() { //if use this.specialisation will be null
        return "Guerrier{" +
                "Specialisation: " + this.unGuerrier.getSpecialisation() + ',' +
                "Hair color: " + this.unGuerrier.getCouleur_Cheveux() + ',' +
                "Taille: " + this.unGuerrier.getTaille() + ',' +
                "Poids: " + this.unGuerrier.getPoids() + ',' +
                '}';
    }
}
