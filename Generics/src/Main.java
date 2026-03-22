import logica.Caja;

public class Main {

    public static void main(String[] args) {
        Caja<String> stringCaja = new Caja<>();
        stringCaja.ponerAlgo("Tipos de datos genericos");
        String contenido = stringCaja.obtenerAlgo();

        System.out.println("El contenido es: " + contenido);

        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(27);
        Integer numero = cajaEnteros.obtenerAlgo();

        System.out.println("El contenido es: " + numero);


    }
}