import logica.Hilo;
import logica.HiloRunnable;

public class Main {
    public static void main(String[] args) {

        Hilo proceso = new Hilo();
        Thread proceso2 = new Thread(new HiloRunnable());
        proceso.start();
        proceso2.start();


    }
}