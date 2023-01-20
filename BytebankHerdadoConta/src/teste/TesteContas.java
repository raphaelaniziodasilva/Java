package teste; // pasta teste

import modelo.ContaCorrente; // importando o arquivo ContaCorrente
import modelo.ContaPoupanca; // importando o arquivo ContaPoupança

public class TesteContas {
    public static void main(String[] args) {
        // criando conta corrente
        ContaCorrente cc = new ContaCorrente(1254, 69887);
        cc.deposita(450);
        cc.deposita(150);
        System.out.println(cc.getSaldo());

        // criando conta popança
        ContaPoupanca cp = new ContaPoupanca(2298, 33695);
        cp.deposita(820);
        cp.deposita(150);
        System.out.println(cp.getSaldo());

        // fazendo transferencia da conta poupança para a corrente
        cc.transfere(150, cp);
        System.out.println("Saldo atualizado CC R$" + cc.getSaldo());
        System.out.println("Saldo atualizado CC R$" + cp.getSaldo());

    }
}
