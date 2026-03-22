package logica;

public class CBulbasaur extends Pokemon implements IPlanta{
    public CBulbasaur() {
    }


    @Override
    public void atacarTackle() {
        System.out.println("Bulbasar usó Tackle");
    }

    @Override
    protected void atacarScratch() {
        System.out.println("Bulbasaur usó Scratch");
    }

    @Override
    protected void atacarBite() {
        System.out.println("Bulbasaur usó Bite");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usó Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usó Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur usó Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur usó Latigo cepa");
    }
}
