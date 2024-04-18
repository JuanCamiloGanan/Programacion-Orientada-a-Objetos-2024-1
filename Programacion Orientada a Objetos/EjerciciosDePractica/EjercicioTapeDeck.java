package edu.ucaldas.poo.EjerciciosDePractica;

public class EjercicioTapeDeck {
    boolean canRecord = false;

    void playTape(){
        System.out.println("tape playing");
    }

    void recordTape(){
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive{
    public static void main(String[] args) {
        EjercicioTapeDeck d = new EjercicioTapeDeck();
        d.canRecord = true;
        d.playTape();
        if(d.canRecord == true){
            d.recordTape();
        }
    }
}
