package edu.ucaldas.poo.EjerciciosDePractica;

public class EjercicioDrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}

class DrumKitTestDrive{
    public static void main(String[] args) {
        EjercicioDrumKit d = new EjercicioDrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();
        if(d.snare == true){
            d.playSnare();
        }
    }
}
