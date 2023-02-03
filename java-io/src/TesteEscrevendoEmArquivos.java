import java.io.*;

public class TesteEscrevendoEmArquivos {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivos - Vamos criar um novo arquivo e escrever dentro dele
        // passando o caminho e criando o arquivo com o nome de "lorem2.txt"
        OutputStream fos = new FileOutputStream("C:\\Users\\rafaa\\Videos\\Alura\\Back-End\\Java\\java-io" +
                "\\src\\lorem2.txt");
        // escrever em caracteres
        Writer osw = new OutputStreamWriter(fos);
        // juntando os caracteres em uma linha
        BufferedWriter bw = new BufferedWriter(osw);
        // escrevendo uma linha de string completa
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        // criando a linha dentro do arquivo
        bw.newLine();


        bw.close();
    }
}
