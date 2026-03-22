package logica;

public class CPikachu extends Pokemon implements IElectrico {
    public CPikachu() {
    }



    @Override
    public void atacarTackle() {
        System.out.println("Pikachu usó Tackle");
    }

    @Override
    protected void atacarScratch() {
        System.out.println("Pikachu usó Scratch");
    }

    @Override
    protected void atacarBite() {
        System.out.println("Pikachu usó Bite");
    }

    @Override
    public void atacarThunderShock() {
        System.out.println("Pikachu usó Thunder Shock");
    }

    @Override
    public void atacarThunderPunch() {
        System.out.println("Pikachu usó Thunder Punch");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu usó Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu usó Rayo carga");
    }
}
