package teste;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayDeContas {
    public static void main(String[] args) {
        // vamos criar um array do tipo Conta para poder guardas a ContaCorrente e ContaPoupanca que forem criadas

        // int[] idades = new int[5]; --> usando como referencia para criar array
        Conta[] contas = new Conta[10]; // array de 10 posições

        // criando uma conta corrente
        ContaCorrente cc1 = new ContaCorrente(145, 22945);

        // adicionando a conta que foi criada dentro do array de contas
        contas[0] = cc1; // conta cc1 adicionado na posição 0

        // criando uma conta poupaca
        ContaPoupanca cp1 = new ContaPoupanca(331, 12487);

        // adicionando a conta que foi criada dentro do array de contas
        contas[1] = cp1; // conta cp1 adicionado na posição 0

        // imprimindo a agencia da ContaCorrente
        System.out.println(contas[0].getAgencia());
        // imprimindo o numero da ContaPoupanca
        System.out.println(contas[1].getNumero());

        // criando uma referencia para apontar para um tipo de conta especifico
        ContaPoupanca ref = (ContaPoupanca) contas[1];
        ContaCorrente refe = (ContaCorrente) contas[0];


        // imprimindo as contas de referencia especifica
        System.out.println(ref.getNumero());
        System.out.println(refe.getAgencia());




    }
}
