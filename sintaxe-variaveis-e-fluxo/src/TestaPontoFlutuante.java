public class TestaPontoFlutuante {
    public static void main(String[] args) {
        // declarando variavel do tipo double para poder usar pontos flutantes, valores com virgula
        double salario;
        salario = 1450.50; // atribuindo valor a variavel
        // imprimindo no terminal
        System.out.println("O meu salario é R$:" + salario);

        // fazendo divisão
        double divisao;
        divisao = 3.14 / 2;
        System.out.println(divisao); // imprimindo no terminal

        // A divisão vai dar errada pois não tem um ponto flutuante
        double novaTentativa = 5/2; // declarando e atribuindo valor a variavel
        System.out.println(novaTentativa);

        // A divisão vai dar certa pois tem um ponto flutuante
        double OutraTentativa = 5.0/2; // declarando e atribuindo valor a variavel
        System.out.println(OutraTentativa);
    }
}
