import java.io.StringReader;

public class Cat {
    String nome;
    float peso;
    boolean ehArisco;
    String cor;

    // Construtor para inicializar um gato com todas as características
    public Cat(String nome, float peso, boolean ehArisco, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.ehArisco = ehArisco;
        this.cor = cor;
    }

    // Construtor para inicializar um gato com nome, peso e cor, definindo arisco como falso e peso padrão como 4.0
    public Cat(String nome, float peso, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        this.ehArisco = false;
    }

    // Construtor para inicializar um gato com nome e cor, definindo arisco como falso e peso padrão como 4.0
    public Cat(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.ehArisco = false;
        this.peso = 4.0f;
    }

    // Métodos adicionais

    public void dormir() {
        System.out.println("ZzZzZ, a mimir");
    }

    public void comer() {
        System.out.println("nhom nhom nhom, delicia de ração <3 ");
    }

    public void fazerManha() {
        System.out.println("miau miau miau, pfvr me da atenção humano!!");
    }

    public void fazerBagunca() {
        System.out.println("hahaha, vo destruir esas casa todinha ò_ó");
    }

    public String toString() {
        return "Nome: " + this.nome + "| Peso: " + this.peso + "| Cor: " + this.cor + "| É arisco? " + this.ehArisco;
    }

    public static void main(String[] args) {
        Cat pudim = new Cat("Pudim", 4.5f, true, "laranja");
        Cat pingado = new Cat("Pingado", 6.0f, false, "frajola");
        Cat paozinho = new Cat("Paozinho", 5.0f, true, "frajola");

        System.out.println(pudim);
        System.out.println(pingado);
        System.out.println(paozinho);
    }
}
