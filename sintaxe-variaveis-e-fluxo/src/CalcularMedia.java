// para deixar escrever no terminal
import java.util.*;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // para deixar escrever no terminal
        teclado.useLocale(Locale.US); // setar o locale - para deixar escrever no terminal

        // fazendo as declarações
        String student;
        float note1; float note2;
        float sum = 0;
        float media = 0; float mediaTurma = 0;

        for(int i = 0; i < 3; i++ ){
            System.out.println("Nome do aluno: ");
            student = teclado.nextLine(); // vai deixar escrever o nome do aluno no terminal
            System.out.println("Primeira nota:");
            note1 = teclado.nextFloat(); // vai deixar escrever a primeira nota no terminal
            System.out.println("Segunda nota:");
            note2 = teclado.nextFloat(); // vai deixar escrever a segunda nota no terminal
            teclado.nextLine(); // não vai mais deixar escrever no terminal

            // calculando  media do aluno
            media = (note1 + note2) / 2;
            System.out.print("Media do aluno: " + media);

            // verificando se o aluno esta aprovado ou reprovado
            if(media >= 7) {
                System.out.println(" Aluno aprovado");
            } else {
                System.out.println(" Aluno reprovado");
            }

            sum += media; // soma total da media dos alunos
            System.out.println("Soma total da turma " + sum);
        }
        mediaTurma += sum / 3; // fazendo a media da turma
        System.out.println("Media da turma " + mediaTurma);
    }
}
