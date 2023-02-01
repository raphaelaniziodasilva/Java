package ArrayList.util;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoListaPorNomes {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // imprimindo lista sem ordenação
        for (Conta conta : lista) {
            System.out.println(conta.getTitular().getNome());
        }

        // criando o comparador e instanciando a classe que tem o metodo de comparação implementado nela
        TitularDaContaComparator comparator = new TitularDaContaComparator();
        // vamos usar na lista o metodo sort do java para ordenar a nossa lista
        lista.sort(comparator);

        System.out.println("---------");

        // imprimindo lista com ordenação
        for (Conta conta : lista) {
            System.out.println(conta.getTitular().getNome());
        }

    }
}

// Ordenando a lista pelo titular da conta. A ordenação vai começar em ordem alfabetica
// vamos fazer a comparação de duas contas pelo Titular da primeira conta com a segunda conta
// vamos usar o metodo do java chamado Comparator que precisamos importar do java.util.Comparator
class TitularDaContaComparator implements Comparator<Conta> {

    // sobreescrevendo o metodo e fazendo as implementções
    @Override
    public int compare(Conta c1, Conta c2) {

        // pegando o nome do titular da primeira conta
        String nomeC1 = c1.getTitular().getNome();
        // pegando o nome do titular da segunda conta
        String nomeC2 = c2.getTitular().getNome();
        // fazendo a comparação das duas contas que vai ser ordenado em ordem alfabetica. Usando o metodo compareTo do java
        return nomeC1.compareTo(nomeC2);
    }
    // vamos criar o nosso comparador e instanciar essa classe na classe que vai fazer a ordenação
}
