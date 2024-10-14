import Animais.Cachorro;

public class Main {

    public static void main(String args[]) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Rex", "Preto", 25, 5.5, "carinho");

        cachorro1.setNome("Rex");
        cachorro1.setCor("Preto");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);

        System.out.println("Nome do cachorro: " + cachorro2.getNome());
        System.out.println("Peso: " + cachorro2.getPeso());
        System.out.println(" ");
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
    }
}