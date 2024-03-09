// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercicios {

        private int somaDosInteirosImpares;

        private int somaDosInteiros( int valorMaximo) {
            int soma = 0;

            for (int i = 0; i <= valorMaximo; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            return soma;
        }




            /* BLOCO COM CONSTRUTURES*/



        public Exercicios(int valorMaximo) {
            this.somaDosInteirosImpares = somaDosInteiros(valorMaximo);
        }

        public  void  imprimindoNumeroInteiros(int valorMaximo){

            int contador = 1;

            while (contador <= valorMaximo){
                System.out.print("\t" + contador);

                if(contador % 5 == 0){
                    System.out.println();
                }
                contador++;
            }

        }


    public static void main(String[] args) {

        int valorMaximo = 3000;
        Exercicios ex = new Exercicios(valorMaximo);

        /*System.out.println("A soma dos inteiros impares é : " + ex.somaDosInteirosImpares);*/

        ex.imprimindoNumeroInteiros(valorMaximo);

    }
}