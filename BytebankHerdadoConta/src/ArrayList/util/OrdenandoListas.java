package ArrayList.util;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoListas {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // imprimindo todas as contas sem ordenação
        for (Conta conta: lista) {
            System.out.println(conta.getNumero());
        }

        // criando o comparator que vai ser do tipo NumeroContaComparador
        NumeroContaComparador comparator = new NumeroContaComparador();
        // vamos usar na lista o metodo sort do java para ordenar a nossa lista
        lista.sort(comparator);

        System.out.println("---------------------");

        // imprimindo todas as contas com ordenação
        for (Conta conta: lista) {
            System.out.println(conta.getNumero());
        }
    }
}

// Vamos fazer a comparação de contas baseadas pelo o numero da conta, definindo qual conta vem antes da outra definindo
// o criterio de comparação e vamos usar o metodo do java chamado Comparator que orecisamos importr do java.util.Comparator
class NumeroContaComparador implements Comparator<Conta> {

    // sobreescrevendo o metodo para fazer a comparação entre duas contas
    @Override
    public int compare(Conta c1, Conta c2) {

        // a ideia e definir quando uma conta e maior ou menor que a outra

        // se o numero da conta c1 for menor que a c2 vai retornar um valor negativo
        if(c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        // se o numero da conta c1 for maior que a c2 vai retornar um valor positivo
        if(c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        // se os numero das contas forem iguais vai retornar 0
        return 0;
    }
}