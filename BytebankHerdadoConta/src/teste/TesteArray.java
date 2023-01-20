package teste; // pasta tete

public class TesteArray {
    public static void main(String[] args) {
        // definindo o tipo de dado e criando um array de 5 posições
        // array do tipo inteiro
        int [] idades = new int[5]; // o array idades já inicializa posição 0

        /**
         * // colocando valores em cada posição do array idades
         *         idades[0] = 29; // posição 0
         *         idades[1] = 55; // posição 1
         *         idades[2] = 66; // posição 2
         *         idades[3] = 22; // posição 3
         *         idades[4] = 15; // posição 4
         *
         *         // acessando a posição do array
         *         int idade4 = idades[4];
         *         // imprimindo
         *         System.out.println(idade4);
         *
         *         // verificando o tamanho do array
         *         System.out.println(idades.length);
         */

        // acessando cada posições do array
        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i; // mutiplicando a posição i por ela mesma
            System.out.println(idades[i]); // imprimindo
        }


    }
}
