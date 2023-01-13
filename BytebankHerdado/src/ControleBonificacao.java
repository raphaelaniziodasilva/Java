public class ControleBonificacao {
    private double soma;

    // inicializando construtor: criando construtor
    public ControleBonificacao(double soma) {
        this.soma = soma;
    }

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }

}
