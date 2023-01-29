package modelo;

public class GuardadorDeContas {
    // criando um array do tipo Conta para guardar as contas que forem criadas
    private Conta[] contas;

    // criando uma posição livre para poder adicionar um novo elemento dentro do array sem sobreescrever o que esta la
    // dentro ou seja com a posição livre esse novo elemento sera adicionado em uma nova posição
    private int posicaoLivre;

    // criando o construtor para inicializar os atributos
    public GuardadorDeContas() {
        //  inicializando array de contas com 10 posições
        this.contas = new Conta[10];

        // inicializando a posição livre começando com 0
        this.posicaoLivre = 0;
    }

    // criando o metodo para adicionar a conta dentro do Array de contas
    // o metodo adiciona devera receber uma referencia do tipo conta
    public void adiciona(Conta ref) {

        // em vez de usar o zero dentro do array vamos usar a posição livre
        this.contas[this.posicaoLivre] = ref;
        // precisamos incrementar, sempre que for adicionado um novo elemento esse elemento sera adicionado em uma nova posição
        this.posicaoLivre++;
    }

    // criando o metodo que vai contar quantas contas ja temos guardada dentro do nosso Array de contas
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre; // vamos devolver a posição livre que começa com 0 e automaticamente ja traz a soma de todas as contas
    }

    // acessando um elemento de dentro do array pela sua posição
    public Conta getPosicao(int pos) {
        return this.contas[pos];
    }
}
