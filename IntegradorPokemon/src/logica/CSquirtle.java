package logica;

public class CSquirtle extends Pokemon implements IAgua {
    public CSquirtle() {
    }



    @Override
    public void atacarTackle() {
        System.out.println("Squirtle usó Tackle");
    }

    @Override
    public void atacarScratch() {
        System.out.println("Squirtle usó Scratch");
    }

    @Override
    protected void atacarBite() {
        System.out.println("Squirtle usó Bite");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usó Hidro Bomba");
    }

    @Override
    public void atacarBubble() {
        System.out.println("Squirtle usó Bubble");
    }

    @Override
    public void atacarWaterGun() {
        System.out.println("Squirtle usó Whater Gun");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle usó Hidro pulso");
    }
}
