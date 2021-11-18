package br.com.bytebank.banco.Java.io;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //fluxo de entrada de arquivos

      OutputStream fos = new FileOutputStream("loren2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("numero 1 por faavor nova linha aki pooooooooo");
//        bw.newLine();
        bw.newLine();
        bw.write("nadaaa");

        bw.close();

    }
}