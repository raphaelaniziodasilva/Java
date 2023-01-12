public class TestaMetodo {
    public static void main(String[] args) {
        // criando uma conta
        Conta contaDoRapha = new Conta();
        // adicionando nome da conta
        contaDoRapha.titular = "Raphael Anizio";
        // adicionando um valor na conta
        contaDoRapha.saldo = 28;
        System.out.println("R$:" + contaDoRapha.saldo);
        // fazendo um deposito chamando o metodo deposita
        contaDoRapha.deposita(20.4);
        System.out.println("R$:" + contaDoRapha.saldo);
        // fazendo um saque chamando o metodo sacar
        contaDoRapha.sacar(49);
        System.out.println(contaDoRapha.titular + " R$:" + contaDoRapha.saldo);

        // criando uma outra conta poder fazer a transferencia
        Conta contaDaLeida = new Conta();
        // adicionando o titular
        contaDaLeida.titular = "Franscisca da silva";
        // vamos depositar valor nessa conta
        contaDaLeida.deposita(1500.00);
        System.out.println("Saldo da conta R$:" + contaDaLeida.saldo);
        // agora vamos fazer a transferencia de valor da contaDaLeida para contaDoRapha
        contaDaLeida.transfere(220.00, contaDoRapha);

        // imprimindo valor das contas atualizados
        System.out.println(contaDaLeida.titular +  " Saldo atualizado R$:" + contaDaLeida.saldo);
        System.out.println(contaDoRapha.titular + " Saldo atualizado R$:" + contaDoRapha.saldo);
    }
}
