package br.com.bytebank.banco.Java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(new File("contas.csv"));
       while (scanner.hasNextLine()){
           String linha = scanner.nextLine();
           System.out.println(linha);

           Scanner linhasScanner = new Scanner(linha);
           linhasScanner.useLocale(Locale.US);
           linhasScanner.useDelimiter(",");

           String valor1 = linhasScanner.next();
           int valor2 = linhasScanner.nextInt();
           int valor3 = linhasScanner.nextInt();
           String valor4 = linhasScanner.next();
           double valor5 = linhasScanner.nextDouble();

           String valorFormatado =  String.format("%s - %s - %s - %s - %s", valor1, valor2, valor3, valor4, valor5);
           System.out.println(valorFormatado);

           linhasScanner.close();
//           String[] valores = linha.split(",");
//            System.out.println(valores[3]);

       }
        scanner.close();
    }
}
