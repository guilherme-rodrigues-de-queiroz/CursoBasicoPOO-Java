import Animais.Cachorro;
import Animais.Gato;
import Lojas.Petshop;

public class Main {

    public static void main(String args[]) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 25, 5.5, "carinho");

        Gato gato1 = new Gato("Bob", "Marrom", 2.4);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println("O " + gato1.getNome() + " está " + gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());

        System.out.println(" ");

        cachorro1.soar();
        gato1.soar();
    }
}