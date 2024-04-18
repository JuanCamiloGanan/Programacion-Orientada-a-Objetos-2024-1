package edu.ucaldas.poo.EjerciciosDePractica;

public class EjercicioEchoTestLine24 {
    public static void main(String[] args) {
        EjercicioEcho2 e1 = new EjercicioEcho2();
        EjercicioEcho2 e2 = new EjercicioEcho2();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e2 = e1;

            if (x > 0) {
                e2.count = e2.count + 4;
            }

            if (x == 3) {
                e2.count = e2.count + e1.count;

            }
            x = x + 1;
        }

        System.out.println(e2.count);
    }
}

class EjercicioEcho2 {
    int count = 0;
    void hello() {
        System.out.println("hellooo... ");

    }
}
