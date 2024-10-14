import Animais.Cachorro;
import Animais.Gato;

public class Main {

    public static void main(String args[]) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 25, 5.5, "carinho");

        Gato gato1 = new Gato("Lua", "Marrom", 2.4);

        cachorro1.soar();
        gato1.soar();
    }
}