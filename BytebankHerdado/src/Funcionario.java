// abstract e relacionado a herança
// quando uma classe e abstract siginifica que não podemos criar uma nova instancia ou objeto dessa classe porém podemos herdar dessa
// classe e criar filhos dela aonde podem ser criados instancia e objetos da classe fiho
// Todas as pessoas que trabalham em uma empresa elas são funcionarios a diferença e que cada funcionario tem o seu cargo

// inicializando construtor: criando construtor
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // inicializando construtor: criando construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // metodo abstract sem corpo, não há implementação ou seja temos implementar esse metodo nos filhos pois eles precisam implementar esse metodo
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}