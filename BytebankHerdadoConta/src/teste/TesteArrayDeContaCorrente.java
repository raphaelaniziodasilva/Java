package teste;
import modelo.ContaCorrente;

public class TesteArrayDeContaCorrente {
    public static void main(String[] args) {
        // vamos criar um array do tipo ContaCorrente para poder guardas as ContaCorrente que forem criadas

        // int[] idades = new int[5]; --> usando como referencia para criar array
        ContaCorrente[] contas = new ContaCorrente[5]; // so pode guardar 5 ContaCorrente

        // criando uma conta corrente
        ContaCorrente cc1 = new ContaCorrente(145, 22945);

        // adicionando a conta que foi criada dentro do array de contas
        contas[0] = cc1; // conta cc1 adicionado na posição 0

        // criando uma nova conta corrente
        ContaCorrente cc2 = new ContaCorrente(996, 36995);

        // adicionando a nova conta dentro do array de contas
        contas[1] = cc2; // conta cc2 adicionado na posição 1

        // vamos acessar o numero da conta cc2
        System.out.println(contas[1].getNumero());
        // vamos acessar o numero da conta cc1
        System.out.println(contas[0].getNumero());

        // vamos acessar a agencia da conta cc1
        System.out.println(contas[0].getAgencia());

        // vamos acessar a agencia da conta cc2
        System.out.println(contas[1].getAgencia());


    }
}
