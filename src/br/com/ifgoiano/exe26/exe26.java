package br.com.ifgoiano.exe26;

import java.util.Scanner;

public class exe26 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o tamanho da matriz quadrada: ");
            int tamanho = sc.nextInt();

            Boolean[][] matriz = new Boolean[tamanho][tamanho];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.printf("Insira o valor da posição: m[%d][%d]: ", (i + 1), (j + 1));
                    matriz[i][j] = sc.nextBoolean();
                }
            }

            System.out.println("Matriz Original: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.printf("%b  ", matriz[i][j]);
                }
                System.out.print("\n");
            }

            System.out.println("Matriz resultante");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == matriz[j][i]) {
                        matriz[i][j] = true;
                    } else {
                        matriz[i][j] = false;
                    }
                    System.out.print(matriz[i][j] + "  ");
                }
                System.out.print("\n");
            }
        }

    }

}
