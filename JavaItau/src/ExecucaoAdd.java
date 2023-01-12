
public class ExecucaoAdd {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); // Instanciei e criei o objeto aluno1
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("Marianne");
        aluno2.setNome("Maiara");
        aluno3.setNome("Lucas");

        Vetor lista = new Vetor();

        // Adicionar aluno

        lista.adicionar(aluno1);
        lista.adicionar(aluno2);
        lista.adicionar(aluno3);

        System.out.println(lista);

        // Adicionar aluno em uma dada posição

//		lista.adicionar(0, aluno3);
//		lista.adicionar(1, aluno2);
//		lista.adicionar(aluno1);

//		System.out.println(lista);

        // Pegar um aluno em dada posição

        Aluno alunoEmPosicao = lista.pegar(0);
        System.out.println(alunoEmPosicao);
//
//		System.out.println(lista.pegar(0)); // direto
//
        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista.contem(aluno2));
        System.out.println(lista.contem(aluno1));

        System.out.println(lista);

        System.out.println(lista.tamanho());

    }

}