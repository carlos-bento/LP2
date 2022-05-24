package br.com.ifgoiano.exe3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Insira o valor " + (i + 1));
                numeros.add(scan.nextInt());
            }

            try {
                for (int i = 0; i < numeros.size(); i++) {
                    if (numeros.get(i).equals(numeros.lastIndexOf(i))) {
                        System.out.println(
                                "Os números " + numeros.get(i) + " e " + numeros.lastIndexOf(i) + " são iguais");
                    } else {
                        System.out.println(
                                "Os números " + numeros.get(i) + " e " + numeros.lastIndexOf(i) + " são diferentes");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Integer n1;
        // Integer n2;
        // Integer n3;
        //
        // System.out.println("Digite o 1ª valor: ");
        // n1 = scan.nextInt();
        // System.out.println("Digite o 2ª valor: ");
        // n2 = scan.nextInt();
        // System.out.println("Digite o 3ª valor: ");
        // n3 = scan.nextInt();
        //
        // for (int i = 0; i < 2; i++) {
        // if (n1 == n2){
        // System.out.println("1ª e o 2ª são iguais");
        // }
        // }

    }
};
