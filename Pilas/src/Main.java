import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia: " + pila);
        System.out.println("Está vacia?: " + pila.empty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }

        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia?: " + pila.empty());

        pila.pop(); //eliminar el ultimo que entró
        System.out.println("Está el 3?: " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
    }
}