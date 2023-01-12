
public class ExecAddPosicao {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("João");
        aluno2.setNome("Joana");
        aluno3.setNome("Luiza");

        Vetor lista = new Vetor();

        // Adicionar aluno em uma dada posição

        lista.adicionar(0, aluno3);
        lista.adicionar(1, aluno2);
        lista.adicionar(aluno1);
        lista.adicionar(3, aluno3);

        System.out.println(lista);

    }

}
