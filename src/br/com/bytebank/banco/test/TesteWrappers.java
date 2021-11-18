package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); //autoBoxing
        System.out.println(idadeRef.doubleValue()); //indboxing


//        double dRef = Double.valueOf(3.2);//autoBoxing
//        System.out.println(dRef.doubleValue()); //unboxing


        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);

    }
}
