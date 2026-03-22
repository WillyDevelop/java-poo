import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1523, "Enzo");
        mapaEmpleados.put(1524, "Julian");
        mapaEmpleados.put(1525, "Rodri");
        mapaEmpleados.put(1526, "Juan");
        mapaEmpleados.put(1527, "Franco");
        mapaEmpleados.put(1528, "Marco");

        boolean estaono = mapaEmpleados.containsValue("Julian Alvarez");
        boolean estaono2 = mapaEmpleados.containsKey(1523);

        if ( estaono== true) {
            System.out.println("SI ESTAAAA");
        } else {
            System.out.println("NO ESTA DAAAAAA");
        }

        if ( estaono2== true) {
            System.out.println("SI ESTAAAA");
        } else {
            System.out.println("NO ESTÁ MALDICIOOON");
        }

        System.out.println(mapaEmpleados.values());

        System.out.println(mapaEmpleados.keySet());

        //utilizamos el id para que devuelva su nombre
        String nombre = mapaEmpleados.get(1524);
        System.out.println("El empleado buscado es: " + nombre);

        //usamos remove para eliminar un empleado
        mapaEmpleados.remove(1527);
    }
}