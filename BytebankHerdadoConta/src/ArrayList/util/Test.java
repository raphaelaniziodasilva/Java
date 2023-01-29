package ArrayList.util;

import modelo.Conta;
import modelo.ContaCorrente;

// vamos utilizar o java.util.ArrayList para poder mexer com arrays sem nos preocupar em fazer um array do 0 e todas funcionalidades
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         // criando uma lista de array, vamos importar o ArrayList do pacote java.util
        ArrayList lista = new ArrayList();

        // criando conta
        Conta cc = new ContaCorrente(10, 17);
        lista.add(cc); // adicionando a conta na lista

        Conta cc2 = new ContaCorrente(12, 17);
        lista.add(cc2);

        // imprimindo quantos elementos esta guardado dentro da minha lista: ArrayList
        System.out.println(lista.size());

        // pegando uma conta da lista
        Conta ref = (Conta) lista.get(0); // (Conta) transformando a referencia mais especifica
        System.out.println(ref.getNumero());

        // removendo o primeiro elemento
        lista.remove(0);

        // imprimindo lista atualizada
        System.out.println("Tamanho " + lista.size());

        // adicionando mais contas
        Conta cc3 = new ContaCorrente(12, 17);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(12, 17);
        lista.add(cc4);
    }
}
