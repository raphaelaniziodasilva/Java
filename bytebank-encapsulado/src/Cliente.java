public class Cliente {
    private String nome;
    private  String cpf;
    private String profissao;

    // inicializando o construtor ou seja crindo o construtor
    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
// a classe  clientevai fazer referencia com o titular da Conta