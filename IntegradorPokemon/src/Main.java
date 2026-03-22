import logica.CBulbasaur;
import logica.CCharmander;
import logica.CPikachu;
import logica.CSquirtle;

public class Main {

    public static void main(String[] args) {
        CSquirtle squirtle = new CSquirtle ();
        CCharmander charmander = new CCharmander ();
        CBulbasaur bulbasaur = new CBulbasaur ();
        CPikachu pikachu = new CPikachu ();

        squirtle.atacarTackle();
        squirtle.atacarHidrobomba();
        charmander.atacarTackle();
        charmander.atacarFlamethrower();
        bulbasaur.atacarTackle();
        bulbasaur.atacarDrenaje();
        pikachu.atacarTackle();
        pikachu.atacarThunderShock();

    }
}