package modelo; // pasta modelo

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double deposita(double valor) {
        return super.saldo += valor;
    }

}
