import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Texto Fixo");

        String texto = input.nextLine();

        System.out.println(texto);

        int valor = input.nextInt();
        System.out.println("Valor: " + valor);


    }

}