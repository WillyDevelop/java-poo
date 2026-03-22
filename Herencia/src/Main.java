import logica.Consultor;
import logica.Empleado;
import logica.Jefe;
import logica.Persona;

public class Main {
    public static void main(String[] args) {
        /* Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre();
        emple.getApellido();

        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getApellido();*/


       /*Polimorfismo permite que en un vector que pertenezca a la clase padre se puede guardar
       distintos tipos que pertenezcan a clases hijas */
        Persona vector[] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
    }
}