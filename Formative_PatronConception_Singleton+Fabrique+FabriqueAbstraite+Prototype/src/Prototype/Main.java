package Prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Guerrier> guerrierArrayList = new ArrayList<>();
        CloneGuerrier cloneGuerrier = new CloneGuerrier();
        Guerrier guerrier1 = new Demon("red",5.2,120); //1st clone from Guerrier
        Guerrier guerrier2 = new Ghost("brun",6.2,200);
        Guerrier guerrier3 = new Sorcerer("black",507,80);


        for(int i = 0; i < 5; i++) {
            Guerrier demon = cloneGuerrier.fabriqueGuerrier(guerrier1); //2nd clone from Guerrier
            Guerrier ghost = cloneGuerrier.fabriqueGuerrier(guerrier2);
            Guerrier sorcerer = cloneGuerrier.fabriqueGuerrier(guerrier3);
            guerrierArrayList.add(demon);
            guerrierArrayList.add(ghost);
            guerrierArrayList.add(sorcerer);
        }

        for (Guerrier i : guerrierArrayList) {
            System.out.println(i);
        }
    }
}