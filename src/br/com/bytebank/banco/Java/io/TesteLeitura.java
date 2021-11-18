package br.com.bytebank.banco.Java.io;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        //fluxo de entrada de arquivos

        FileInputStream fis = new FileInputStream("loren.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

         String  linha = br.readLine();

         while (linha != null) {
             System.out.println(linha);
             linha = br.readLine();
         }
         br.close();

    }
}
