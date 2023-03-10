// Gerente e um Funcionario, gerente herda da class Funcionario, gerente assina contrato Autenticavel
// assinando contrato com a interface Autenticado
// precisamos implementar o contrato definido usando a palavra chave implements

public class Gerente extends Funcionario implements Autenticado{

    private int senha;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        // usamos o super para poder conseguir pegar o metodo da classe pai
        return super.getSalario();
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
