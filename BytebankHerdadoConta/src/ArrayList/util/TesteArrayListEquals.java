package ArrayList.util;

import modelo.Conta;
import modelo.ContaCorrente;
import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        // criando uma lista de array, vamos importar o List e ArrayList do pacote java.util
        // List quando um elemento de dentro do array for deletado ele ira puxar os demais elementos ocupando o espaço do elemento que foi deletado
        // ArrayList vai funcionar como um array normal com todos os metodos
        // e dentro dessa lista vamos adicionar e remover as contas correntes e poupança
       List<Conta> lista = new ArrayList<Conta>();

        // criando conta corrente
        Conta cc = new ContaCorrente(11, 27);
        lista.add(cc); // adicionando a conta na lista

        Conta cc2 = new ContaCorrente(12, 17);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(12, 17);

        // verificando se dentro do array existe determinada conta
        boolean existe = lista.contains(cc3);

        // imprimindo se a conta ja existe
        System.out.println("Ja existe? " + existe);


        /**
         *         / Agora vamos testar o metodo eIgual que agente criou para fazer a verificação das contas se são iguais
         *
         *         // criando contas
         *         Conta cc1 = new ContaCorrente(10, 17);
         *         lista.add(cc1); // adicionando a conta na lista
         *
         *         Conta cc5 = new ContaCorrente(10, 17);
         *         lista.add(cc5);
         *
         *         // as contas vão ser iguais
         *         boolean igual = cc1.ehIgual(cc5);
         *         System.out.println(igual);
         *
         *         // as contas são diferentes
         *         igual = cc1.ehIgual(cc5);
         *         System.out.println(igual);
         */
    }
}
