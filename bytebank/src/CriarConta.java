public class CriarConta {
    public static void main(String[] args) {
        // criando variavel primeiraConta vai ser do tipo Conta e instanciando a conta
        Conta primeiraConta = new Conta();
        // atribuindo saldo na primeiraConta
        primeiraConta.saldo = 250;
        // imprimindo o saldo da primeiraConta
        System.out.println(primeiraConta.saldo);
        // adicionando valor no saldo da primeiraConta
        primeiraConta.saldo += 125.5;
        // imprimindo o saldo atualizado da primeiraConta
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 25.50;
        System.out.println(segundaConta.saldo);

        // imprimindo o valor das duas contas
        System.out.println("Valor da primeira conta R$:" + primeiraConta.saldo + " Valor da segunda conta R$:" + segundaConta.saldo);
    }
}
