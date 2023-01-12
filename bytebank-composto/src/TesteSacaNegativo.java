public class TesteSacaNegativo {
    public static void main(String[] args) {
        // o objetivo aqui e ficar com a quantidade de dinheiro negativo
        // criando conta
        Conta conta = new Conta();
        conta.deposita(140);
        conta.sacar(150);
        // chamando o metodo getSaldo porque o saldo esta privado para agente poder ver o valor do saldo
        System.out.println(conta.getsaldo());


        /*
        // Essa forma para deixar um valor negativo esta errado pois temos que criar um metodo que faça isso
        System.out.println(conta.saldo);
        conta.saldo = conta.saldo - 150;
        System.out.println(conta.saldo);
         */
    }
}
