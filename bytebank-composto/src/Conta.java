// criando modelo: entidade Conta
public class Conta {
    // declarando atributos: propriedades
    private double saldo;
    int agencia;
    int numero;
    // titular vai ser do tipo Cliente aonde a class Cliente contém as informações do clinete
    // atributo que tem referencia para outros objetos de outras classes
    Cliente titular; // toda conta tem um titular

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

    // o saldo esta privado então temos que criar um metodo que devolve o saldo, pegue o saldo e informe o saldo aonde podemos usar o saldo fora da classe
    public double getsaldo() {
        return this.saldo;
    }
}
