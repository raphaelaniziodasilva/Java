package ArrayList.util;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

// vamos utilizar o java.util.ArrayList para poder mexer com arrays sem nos preocupar em fazer um array do 0 e todas funcionalidades
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         // criando uma lista de array, vamos importar o ArrayList do pacote java.util
         // e dentro dessa lista vamos adicionar e remover as contas correntes e poupança
        ArrayList lista = new ArrayList();

        // criando conta corrente
        Conta cc = new ContaCorrente(10, 17);
        lista.add(cc); // adicionando a conta na lista

        Conta cc2 = new ContaCorrente(12, 17);
        lista.add(cc2);

        // imprimindo quantos elementos esta guardado dentro da minha lista: ArrayList
        System.out.println(lista.size());

        // removendo o primeiro elemento
        lista.remove(0);

        // imprimindo lista atualizada
        System.out.println("Tamanho " + lista.size());

        // // criando conta poupança
        Conta cp = new ContaCorrente(25, 77);
        lista.add(cp);
        Conta cp2 = new ContaCorrente(3, 30);
        lista.add(cp2);

        // imprimindo a lista atualizada: ArrayList
        System.out.println(lista.size());

        // pegando uma conta da lista
        Conta ref = (Conta) lista.get(0); // (Conta) transformando a referencia mais especifica
        System.out.println(ref.getNumero());

        // Criando ArrayList com o código mais legível, já que fica explícito o tipo dos elementos.
        // ArrayList vai ser do tipo conta ou seja o compilador so vai deixar adicionar as contas outro objeto ou
        // elemento que não for conta não sera adicionado

        ArrayList<Conta> ListaDeContas = new ArrayList<Conta>();
        // criando e adicionando as contas no ArrayList do tipo Conta
        Conta cc4 = new ContaCorrente(10, 17);
        ListaDeContas.add(cc4); // adicionando a conta na lista

        Conta cp4 = new ContaCorrente(25, 77);
        ListaDeContas.add(cp4);

        // Adicionando cliente no  doArrayList tipo Conta aonde o compilador não vai deixar ser adicionado pois so aceita Contas
        // Cliente cliente = new Cliente();
        // ListaDeContas.add(cliente);

    }
}
