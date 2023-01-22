package teste;
import modelo.ContaPoupanca;

public class TesteArrayDeContaPoupanca {
    public static void main(String[] args) {
        // vamos criar um array do tipo ContaPoupanca  para poder guardas as ContaPoupanca  que forem criadas

        // int[] idades = new int[5]; --> usando como referencia para criar array
        ContaPoupanca[] contas = new ContaPoupanca[5]; // so pode guardar 5 ContaCorrente

        // criando uma conta poupaca
        ContaPoupanca cp1 = new ContaPoupanca(331, 12487);

        // adicionando a conta que foi criada dentro do array de contas
        contas[0] = cp1; // conta cc1 adicionado na posição 0

        // criando uma nova conta poupanca
        ContaPoupanca cp2 = new ContaPoupanca(119, 98553);

        // adicionando a nova conta dentro do array de contas
        contas[1] = cp2; // conta cc2 adicionado na posição 1

        // vamos acessar o numero da conta cp2
        System.out.println(contas[1].getNumero());
        // vamos acessar o numero da conta cp1
        System.out.println(contas[0].getNumero());

        // vamos acessar a agencia da conta cp1
        System.out.println(contas[0].getAgencia());

        // vamos acessar a agencia da conta cp2
        System.out.println(contas[1].getAgencia());


    }
}
