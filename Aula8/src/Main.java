public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Onca onca = new Onca(2);
        onca.cacar();
        onca.comer();
        onca.especie = "pintada";
        System.out.println(onca);
    }
}