package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public String estadoCachorro;

    // metodos
    public void comer(){} // void para não ter retorno

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoCachorro = "Feliz";
        } else if(acao.equals("vai dormir!")) {
            this.estadoCachorro = "Bravo";
        } else {
            this.estadoCachorro = "Neutro";
        }
        return estadoCachorro;
    }
}
