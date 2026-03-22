package logica;

//en la clase caja le establecemos un parametro
//que puede recibir un tipo de dato generico: <T>
public class Caja <T>{
    //declaramos que el contenido puede ser de tipo generico
    private T contenido;

    //dos metodos van a recibir un contenido generico
    public void ponerAlgo(T contenido){
        this.contenido = contenido;
    }

    public T obtenerAlgo(){
        return contenido;
    }
}
