package logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarTackle();
    protected abstract void atacarScratch();
    protected abstract void atacarBite();

}
