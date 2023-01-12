public class TestaLacos {
    public static void main(String[] args) {
        // criando uma tabuada usando for
        int resposta;
        for(int mutiplicador = 1; mutiplicador <= 10; mutiplicador++) {
            for(int contador = 0; contador <=10; contador++) {
                resposta = mutiplicador * contador;
                System.out.print(mutiplicador + " x " + contador + " = " + resposta );
                System.out.println();
            }
            System.out.println();
        }
    }
}
