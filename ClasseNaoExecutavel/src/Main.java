import Animais.Cachorro;

public class Main {

    public static void main(String args[]) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.cor = "Preto";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;

        System.out.println(cachorro1); // salvo na memória do java usando package
    }
}