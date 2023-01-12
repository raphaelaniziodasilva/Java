public class TestaConversao {
    public static void main(String[] args) {
        // vamos fazer uma conversão de double para int
        double salario = 1450.80;

        // vamos colocar o valor salario que esta em double numa variavel do tipo inteiro
        // agora vamos moldar o double para que ele se encaixe no inteiro para isso precisamos usar a sintaxi de castim:(int)
        // O castim: (int) ele vai transformar o double em um valor do tipo inteiro
        int valor = (int) salario;
        // quando imprimir na tela só vai mostrar o valor inteiro
        System.out.println(valor);


    }
}
