package br.com.bytebank.banco.Java.io;

import java.io.*;

public class TesteEscrevitaPRintStreamWriter {
    public static void main(String[] args) throws IOException {

        //fluxo de entrada de arquivos

//        OutputStream fos = new FileOutputStream("loren2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        // BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));

        //PrintWriter ps = new PrintWriter("loren2.txt");
        PrintStream ps = new PrintStream("loren2.txt");

        ps.println("ola tudeboem co mv emmmmm 4444444");
        ps.println();
        ps.println();
        ps.println("asajsasjasasasasa");


        ps.close();

    }
}
