package modelo; // pasta modelo

/**
 * Classe representa a moldura de uma conta
 *
 *  classe abstract não pode criar objetos ou instanciar essa classe porém so vai poder instanciar e criar objetos dos
 *  filhos dessa classe ou seja as classes que herdam dessa classe
 */
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * criando construtor para inicializar o objeto conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    /**
     * criando metodos
     * regras de negocios
     */

    public double deposita(double valor){
        return this.saldo += valor;
    }

    public boolean saca(double valor) {
        // verificando se tem valor suficiente para o saque
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        // verificando se tem valor suficiente para a transferencia
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}