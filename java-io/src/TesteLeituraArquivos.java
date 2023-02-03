import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeituraArquivos {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivos - Vamos fazer a leitura de arquivos
        // pegando arquivo passando o caminho
        FileInputStream fis = new FileInputStream("C:\\Users\\rafaa\\Videos\\Alura\\Back-End\\Java\\java-io" +
                "\\src\\lorem.txt");
        // transformando em caracteres
        InputStreamReader isr = new InputStreamReader(fis);
        // juntando os caracteres que estão dentro de uma linha
        BufferedReader br = new BufferedReader(isr);
        // lendo a primeira linha
        String linha = br.readLine();
        System.out.println(linha);

        // agora vamos ler o arquivo inteiro
        while(linha != null) { // quando a linha não for null
            linha = br.readLine(); // lendo as linhas
            System.out.println(linha); // imprimindo linha
        }

        br.close();
    }
}