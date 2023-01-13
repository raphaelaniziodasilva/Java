// Nesse arquivo so os gerentes e administradores vão poder ter acesso
public class SistemaInterno {
    // definindo a senha do sistema, a pessoa que tiver acesso a essa senha conseguira se auttenticar e entrar no sistema
    private int senha = 2585;


    // fazendo autenticação do funcionario
    // o parametro: referencia fa vai ser do tipo FuncionarioAutenticado
    public void autentica(Autenticado fa ) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sisteema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }

    }

}
