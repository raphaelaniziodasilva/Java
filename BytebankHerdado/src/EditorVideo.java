//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {

    // inicializando construtor: criando construtor
    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de video");
        return 150;
    }

}
