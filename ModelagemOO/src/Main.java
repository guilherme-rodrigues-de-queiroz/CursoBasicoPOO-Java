import Animais.Cachorro;

public class Main {

    public static void main(String args[]) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 25, 5.5, "carinho");

        Cachorro cachorro2 = new Cachorro("Doguinho", "Preto", 20, 4.5, "carinho");

        System.out.println("Número de cachorros: " + cachorro1.getNumeroDeCachorros());

        // imprime o nome do objeto guardado na memória
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }
}