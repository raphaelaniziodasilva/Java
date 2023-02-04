package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEscreverLerArquivo {

    public static void main(String[] args) throws IOException {

//		Socket s = new Socket();
        // escrevendo no terminal
        InputStream fis = System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // lendo no terminal
        OutputStream fos = System.out;  //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        // lendo as linha
        String linha = br.readLine();

        while( !(linha == null || linha.isEmpty()) ) {
            bw.write(linha); // escrevendo
            bw.newLine(); // nova linha
            bw.flush(); // vai imprimir a linha no terminal
            linha = br.readLine(); // lendo as linhas
        }

        br.close();
        bw.close();

    }
}
