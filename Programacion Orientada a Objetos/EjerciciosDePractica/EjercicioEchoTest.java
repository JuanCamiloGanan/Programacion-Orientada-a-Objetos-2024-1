package edu.ucaldas.poo.EjerciciosDePractica;
public class EjercicioEchoTest extends EjercicioEcho{
    public static void main(String[] args) {
        EjercicioEcho e1 = new EjercicioEchoTest();
        EjercicioEcho e2 = new EjercicioEchoTest();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e2 = e1;

            if (x > 0) {
                e2.count = e2.count + 1;
            }

            if (x > 1) {
                e2.count = e2.count + e1.count;

            }
            x = x + 1;
        }

        System.out.println(e2.count);
    }
}
class EjercicioEcho {
    int count = 0;
    void hello() {
        System.out.println("hellooo... ");

    }
}


