package br.com.ifgoiano.exe14;

import java.util.Scanner;

public class exe14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Digite a quantidade de números que deseja inserir:" );
        Integer qtdNumeros = sc.nextInt ( );

        Integer[] numeros = new Integer[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println ( "Digite o " + (i + 1) + "º número:" );
            numeros[i] = sc.nextInt ( );
        }

        geraMatriz ( qtdNumeros, numeros );


    }

    public static void geraMatriz(Integer qtdNumeros, Integer[] numeros) {

        boolean matrizQuadrada = true;

        Integer tamanho = numeros.length;
        for(Integer linha : numeros){
            if (tamanho != linha) {
                matrizQuadrada = false;
                break;
            }
        }

        System.out.println ( "A matriz é quadrada? " + matrizQuadrada );

    }

    //create method to print square matrix
    public static void imprimeMatriz(Integer[][] matriz) {
        for (Integer[] integers : matriz) {
            for (Integer integer : integers) {
                System.out.print ( integer + " " );
            }
            System.out.println ( );
        }
    }

}
