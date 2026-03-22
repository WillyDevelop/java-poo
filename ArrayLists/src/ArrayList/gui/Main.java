package ArrayList.gui;

import ArrayList.logica.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Julian", 23));
        listaArray.add(new Persona(2, "Leo", 21));
        listaArray.add(new Persona(3, "Rodri", 18));
        listaArray.add(new Persona(4, "Jose", 43));

        LinkedList<Persona> ListaLinked = new LinkedList<Persona>();
        ListaLinked.add(new Persona(1, "Julian", 23));
        ListaLinked.add(new Persona(2, "Leo", 21));
        ListaLinked.add(new Persona(3, "Rodri", 18));
        ListaLinked.add(new Persona(4, "Jose", 43));



        System.out.println("---------FOR --------");
        //recorrer por indice
        for (int i = 0; i <listaArray.size(); i++) {
            System.out.println("prueba " + listaArray.get(i).getNombre());
        }

        System.out.println("");
        System.out.println("-------- FOR EACH-----------");
        //recorrido foreach
        for (Persona perso:listaArray){
            System.out.println("prueba: " + perso.getNombre());
        }



        //Remove en ArrayList
        listaArray.remove(1);

        String nombreBorrar = "Gabriel";
        for (Persona persona2 : ListaLinked){
            if (persona2.getNombre().equals(nombreBorrar)) {
                ListaLinked.remove(persona2);
                break; //corto que deja de recorrer
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("------ LUEGO DE ELIMINAR ------");
        System.out.println("");
        //recorrido por foreach
        System.out.println("------- ARRAYLIST ------");
        for (Persona persona:listaArray){
            System.out.println("prueba::: " + persona.getNombre());
        }

        System.out.println("------ LINKEDLIST -------");
        for (Persona persona:listaArray) {
            System.out.println("prueba " + persona.getNombre());
        }


        //tamaño de la lista
        System.out.println("");
        System.out.println(" ------- Que tamaño tienen las listas?-----");
        System.out.println("Arraylist: " + listaArray.size());
        System.out.println("LinkedList " + ListaLinked.size());


        //obtener primer objeto
        System.out.println("");
        System.out.println("------ Primer y ultimo Objeto (Solo para LINKED LIST)----");

        System.out.println("Primero de LinkedList: " + ListaLinked.getFirst().toString());
        System.out.println("Ultimo de LinkedList: " + ListaLinked.getLast().toString());


        //borrar toda la lista
        System.out.println("");
        System.out.println("------- Borrando listas..... --------");
        listaArray.clear();
        ListaLinked.clear();

        //comprobar si está vacia
        System.out.println("");
        System.out.println(" --------- Está vacia alguna lista? -------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + ListaLinked.isEmpty());

    }

}