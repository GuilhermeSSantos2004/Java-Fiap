public class StringPalindromo {

    public static String verificarPalavra(String palavra){

        StringBuilder buffer = new StringBuilder(palavra);

        String palavraInvertida = buffer.reverse().toString();

        if (palavraInvertida.equals(palavra)){
            return "É um Palindromo";
        } else {
            return "Não é um Palindromo";
        }
    }

    public static void main(String[] args) {
        String palavra = "radar";
        System.out.println(verificarPalavra(palavra));
    }
}
