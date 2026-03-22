public class Main {
    public static void main(String[] args) {
        try{
            int resultado = 3/0;
        }
        catch (Exception e) {
            System.out.println("No se puede dividir por cero!!!");
        }


        try {
            int edades [] = {15,12,23,30};

            System.out.println("La edad de la posiicion 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentaste acceder a un indice que no existe");
        }
    }
}