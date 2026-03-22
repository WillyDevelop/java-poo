public class Main {
    public static void main(String[] args) {
        double num = 1.70;

        //casteo a entero
        int numInt = (int) num;

        //casteo
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);


        String cantifad = "15";
        String precio = "150.27";

        int cantEntero = Integer.parseInt(cantifad);
        double precioDouble = Double.parseDouble(precio);

        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));


        int edad = 27;
        double estatura = 1.70;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
    }

}