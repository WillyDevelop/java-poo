import logica.Auto;
import logica.Propietario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creamos un auto vacio y le asignamos marca y modelo
        Auto aut = new Auto ();
        aut.setId(1L);
        aut.setMarca("Ferrari");
        aut.setModelo("Spider");

        //creamos una lista de propietarios vacios
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        //creamos dos propietarios vacios
        Propietario prop1 = new Propietario ();
        Propietario prop2 = new Propietario ();

        //Le asignamos sus datos
        prop1.setId(27L);
        prop1.setNombre("Willy");
        prop1.setApellido("Develop");

        prop2.setId(28L);
        prop2.setNombre("Will");
        prop2.setApellido("Dev");

        //guardamos esos dos propietarios en la lista vacio
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        //esa lista que creamos le asignamos al auto
        aut.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() +" " + aut.getModelo()
                + " tiene como propietarios a " + aut.getListaPropietarios().toString());
    }
}