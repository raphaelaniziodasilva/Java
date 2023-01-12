//new ContaCorrente()
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // a cada saque que for feito pela CC vai cobrar uma taxa de 20 centavos
    @Override // sobrescrevendo o metodo
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double deposita(double valor) {
        return super.saldo += valor;
    }
}
