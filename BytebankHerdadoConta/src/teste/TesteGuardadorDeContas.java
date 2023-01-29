package teste;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {

        // agora vamos criar o nosso guardador de contas e usar esse guardador colocando umas contas dentro dele
        GuardadorDeContas guardador = new GuardadorDeContas();

        // criando conta corrente
        Conta cc = new ContaCorrente(22, 8);
        // adicionando a conta criada dentro do guardador de contas: Array de contas
        guardador.adiciona(cc); // usando o metodo adiciona

        Conta cc2 = new ContaCorrente(1, 10);
        guardador.adiciona(cc2);

        // criar uma variavel para saber quantos elementos ja tem guardado dentro do guardador de contas: Array de contas
        // vamos usar o metodo do guardador que e getQuantidadeDeElementos que vai trazer o resultado de quantas contas ja temos guardadas
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        // vamos acessar uma conta que esta dentro do array pela sua posição
        Conta posicao = guardador.getPosicao(1);
        System.out.println(posicao.getNumero());


    }
}
