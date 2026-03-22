public class Main {

    enum Color {
        ROJO, AZUL, VERDE, AMARILLO, VIOLETA, NEGRO, BLANCO
    }

    public static void main(String[] args) {
        Color color = Color.ROJO;
        System.out.println("El color es: " + color);

        System.out.println("------------------");

        for (Color c : Color.values()) {
            System.out.println("El color es: " + c);
        }
    }
}