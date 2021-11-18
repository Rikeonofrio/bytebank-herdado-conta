package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteWapperInterger {
    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nome = new String[5];


        int idade = 29;// integer


        Integer idadeRef = Integer.valueOf(29); //autoBoxing
        int valor = idadeRef.intValue(); //unBoxing




        String s = args[0];//"10"

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);

        System.out.println(numero);


        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(29); //AutoBoxing


    }
}
