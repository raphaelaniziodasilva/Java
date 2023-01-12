public class TestaValores {
    public static void main(String[] args) {
        // criando uma nova conta atraves do construtor
        Conta conta = new Conta(9161, 110325-4);
        Conta israel = new Conta(9161, 4578-9);
        Conta dede = new Conta(9161, 63255-4);
        Conta neto = new Conta(9161, 33299-4);


        conta.setAgencia(-58);
        conta.setNumero(-321);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
}
