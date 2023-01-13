// Administrador e um Funcionario, Administrador herda da class Funcionario, Administrador assina contrato Autenticavel
// assinando contrato com a interface Autenticado
// precisamos implementar o contrato definido usando a palavra chave implements
public class Administrador extends Funcionario implements Autenticado {

    private int senha;

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    // implementando os metodos abstratos da interface Autentica
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    // fazendo autenticação so pessoas autenticadas podem ter acesso ao sistema interno
    @Override
    public boolean autentica(int senha) {
        // verificando se a senha que o funcionario autenticado digitou e igual a do sistema interno
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
