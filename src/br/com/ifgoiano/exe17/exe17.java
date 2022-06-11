package br.com.ifgoiano.exe17;

import java.util.Scanner;

public class exe17 {

    public static void main(String[] args) {
        int contador = 0;

        int qntV1 = insereQuantidade ( );
        int qntV2 = insereQuantidade ( );

        Integer[] v1 = new Integer[qntV1];
        Integer[] v2 = new Integer[qntV2];

        v1 = populaVetor ( v1 );
        v2 = populaVetor ( v2 );

        for (int valoresV1 = 0; valoresV1 < v1.length; valoresV1++) {
            for (int valoresV2 = 0; valoresV2 < v2.length; valoresV2++) {
                if (v1[valoresV1].equals( v2[valoresV2] )) {
                    contador++;
                }
            }
        }

        System.out.println ( "Os vetores V1 e V2 possuem: " + contador + " valores iguais" );
    }

    public static Integer insereQuantidade() {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Digite a quantidade de valores do vetor" );
        int qnt = sc.nextInt ( );

        verificaQnt ( qnt );

        return qnt;
    }

    public static void verificaQnt( int qnt ){

        if (qnt > 50) {
            System.out.println ( "A quantidade de valores inseridos no vetor devem ser menores que 50" );
            insereQuantidade ( );
        }

    }

    public static Integer[] populaVetor(Integer[] vetor) {

        Scanner sc = new Scanner ( System.in );

        for (int i = 0; i < vetor.length; i++) {
            System.out.println ( "Digite o " + (i + 1) + "º valor do vetor: " );
            vetor[i] = sc.nextInt ( );
        }

        return vetor;
    }

}
