// assinando contrato com a interface Autenticado
// precisamos implementar o contrato definido usando a palavra chave implements

public class Cliente  implements Autenticado {
    private int senha;

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