package Animais;

public class Cachorro {
    // atributos
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoCachorro;

    // Construtores
    public Cachorro(){}

    public Cachorro(String nome, String cor, int altura, double peso, String estadoCachorro) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoCachorro = estadoCachorro;

        numeroDeCachorros++; // numeroDeCachorros + 1
    }

    // metodos
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoCachorro() {
        return estadoCachorro;
    }

    public void setEstadoCachorro(String estadoCachorro) {
        this.estadoCachorro = estadoCachorro;
    }

    // metodos
    public void comer(){} // void para não ter retorno

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        //switch serve para enum
        switch (acao){
            case "carinho": this.estadoCachorro = "Feliz"; break;
            case "vai dormir!": this.estadoCachorro = "Bravo"; break;
            case "pisar na patinha": this.estadoCachorro = "Triste"; break;
            default: this.estadoCachorro = "Neutro";
        }
        return this.estadoCachorro;
    }

    // retorna o nome do objeto guardado na memória
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}