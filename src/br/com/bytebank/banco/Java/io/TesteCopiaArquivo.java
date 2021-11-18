package br.com.bytebank.banco.Java.io;



import java.io.*;
import java.net.Socket;

public class TesteCopiaArquivo {
    public static void main(String[] args) throws IOException {
        // para conexao
         Socket s = new Socket();


        //fluxo de entrada de arquivos
        InputStream fis = s.getInputStream();//System.in; //new FileInputSream("loren.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);


        //Fluxo de Saida de Arquiivos
        OutputStream fos = System.out;//new FileOutputStream("loren2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


            String  linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
