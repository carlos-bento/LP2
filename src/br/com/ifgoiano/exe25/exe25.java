package br.com.ifgoiano.exe25;

import java.util.Scanner;

public class exe25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Informe o tamanho da matriz quadrada: " );
        int tamanho = scanner.nextInt ( );

        Integer[][] matriz = new Integer[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf ( "Insira o valor na posição m[%d][%d] = ", (i + 1), (j + 1) );
                matriz[i][j] = scanner.nextInt ( );
            }
        }

        System.out.println ( "Matriz Original: " );
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf ( "%d  ", matriz[i][j] );
            }
            System.out.print ( "\n" );
        }

        System.out.println ( "\nMatriz Inversa: " );
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf ( "%d  ", matriz[j][i] );
            }
            System.out.print ( "\n" );
        }

    }

}
