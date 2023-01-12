// criando modelo: entidade Conta
class Conta {
    // declarando atribsutos: propriedades
    double saldo;
    int agencia;
    int numero;
    String titular;

    // criando metodos

    // depositar valor na conta
    public void deposita(double valor) {
        this.saldo += valor;
    }

    // sacando valor da conta
    public boolean sacar(double valor) {
        // verificando se tem valor do saque
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor do saldo insuficiente para saque");
            return false;
        }
    }

    // transferindo valor de uma conta para outra
    public boolean transfere(double valor, Conta contaDestino){
        // verificando se tem valor disponivel para fazer a transferencia
        if(this.saldo >= valor) {
            this.saldo -= valor; // retirando o valor da conta
            // contaDestino.saldo += valor; // depositando o valor retirado para a contaDestino

            // reutilizando o metodo depositar para poder depositar o valor retirado para a contaDestino
            contaDestino.deposita(valor);
            System.out.println("Transferencia com sucesso");
            return true; // transferencia com sucesso
        } else {
            System.out.println("Valor do saldo insuficiente para transferencia");
            return false;
        }
    }
}
