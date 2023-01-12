// criando modelo: entidade Conta
public class Conta {
    // declarando atributos: propriedades
    private double saldo;
    private int agencia;
    private int numero;
    // titular vai ser do tipo Cliente aonde a class Cliente contém as informações do clinete
    // atributo que tem referencia para outros objetos de outras classes ou seja relacionamento
    private Cliente titular; // toda conta tem um titular

    // static e um atributo da classe não e mais do objeto ou seja vamos guardar o valor de quantas contas forem criadas no total
    private static int total;

    // inicializando o construtor ou seja toda vez que uma conta nova for criada precisa passar como
    // parametro as informações que esta dentro do construtor
    public Conta(int agencia, int numero) {
        // fazendo a contagem de quantas contas esta sendo criadas
        Conta.total ++;
        System.out.println("O total de contas e " + Conta.total);

        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta que contém a agencia " + this.agencia + " e numero " + this.numero);
    }

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

    // Com todos os nossos atributos privados temos que criar metodos para poder ter acesso fora da classe tanto para
    // ler e fazer modificações. Get e para ler e Set e para fazer modificações

    // metodo get: ler
    public double getsaldo() {
        return this.saldo;
    }

    // metodo get: ler
    public int getNumero() {
        return this.numero;
    }
    // metodo set: para fazer alterações, modificar
    // normalmente metodos que alteram atributos geralmente eles são do tipo void eles alteram o atributo e não devolvem nada
    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não pode ter numeros menores que zero ou negativos Ex: -1");
            return; // para parar a execução do if
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não pode ter numeros menores que zero ou negativos Ex: -1");
            return;  // para parar a execução do if
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {

        return this.titular;
    }
    public void setTitular(Cliente titular) {

        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
