public class TestaBanco {
    public static void main(String[] args) {
        // criando cliente que vai ser do tipo Cliente
        Cliente raphael = new Cliente();
        // populando as informações
        raphael.nome = "Raphael anizio";
        raphael.cpf = "114.587.698.69";
        raphael.profissao = "Desenvolvedor web";

        // criando a conta do banco do raphael que vai ser do tipo Conta
        Conta contaDoRaphael = new Conta();
        // depositando valor na conta
        contaDoRaphael.deposita(1450.00);

        // associa o cliente raphael a conta contaDoRaphael
        // fazendo associação: a conta contaDoRaphael vai receber o cliente raphael
        contaDoRaphael.titular = raphael;
        System.out.println(contaDoRaphael.titular.nome); // imprimindo o nome do titular da conta


    }
}
    