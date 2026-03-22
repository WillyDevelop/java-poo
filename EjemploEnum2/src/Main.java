import ejemploenum2.enums.Color;

public class Main {
    public static void main(String[] args) {
        for(Color color : Color.values()){
            System.out.println("Color: " + color);
        }

        Color col = Color.AZUL;

        //nos trae el nombre de la constante
        System.out.println(col.name());

        //indica la posicion del elemento dentro del vector
        System.out.println(col.ordinal());


        //Le decimos el valor y lo busca dentro del vector
        col = Color.valueOf("AZUL");
        System.out.println("Encontre: " + col);

        //definimos una excepcion por si no encuentra el valor

        try {
            col = Color.valueOf("CELESTE");
            System.out.println("Encontre: " + col);
        } catch (IllegalArgumentException e) {
            System.out.println("Ocurrió una excepcion: El valor no es correcto");
        }
    }

}