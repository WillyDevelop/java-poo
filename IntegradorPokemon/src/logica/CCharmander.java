package logica;

public class CCharmander extends Pokemon implements IFuego {
    public CCharmander() {
    }



    @Override
    public void atacarTackle() {
        System.out.println("Charmander usó Tackle");
    }

    @Override
    protected void atacarScratch() {
        System.out.println("Charmander usó Scratch");
    }

    @Override
    protected void atacarBite() {
        System.out.println("Charmander usó Bite");
    }

    @Override
    public void atacarFirePunch() {
        System.out.println("Charmander usó FirePunch");
    }

    @Override
    public void atacarFlamethrower() {
        System.out.println("Charmander usó Flamethower");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó Ascuas");
    }
}
