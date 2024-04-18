package edu.ucaldas.poo.EjerciciosDePractica;

public class EjercicioDvdPlayer {
    boolean canRecord = false;

    void recordDVD(){
        System.out.println("DVD recording");
    }

    void playDVD(){
        System.out.println("DVD playing");
    }
}

class DvdPlayerTestDrive{
    public static void main(String[] args) {
        EjercicioDvdPlayer d = new EjercicioDvdPlayer();
        d.canRecord = true;
        d.playDVD();
        if(d.canRecord == true){
            d.recordDVD();
        }
    }
}