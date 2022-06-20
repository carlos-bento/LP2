package br.com.ifgoiano.exe27;

import java.util.Random;
import java.util.Scanner;

public class Teste {

    // 27. Escreva um programa Java para encontrar os 𝑘 maiores elementos em um
    // determinado array
    // multidimensional. Os elementos na matriz podem estar em qualquer ordem e 𝑘
    // deve ser informado pelo
    // usuário.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int k, i, j, cont = 0, maior;
        int mat[][] = new int[10][10];
        Random gerador = new Random();

        // Gerar 100 numeros inteiros na matriz
        System.out.printf("Numero gerado na matriz:\n");// Verificar
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                mat[i][j] = gerador.nextInt(100);
                System.out.printf("%d ", mat[i][j]);// Verificar
            }
            System.out.print("\n");
        }

        System.out.printf("Quantos numeros deseja consultar: ");
        k = ler.nextInt();

        int vet[] = new int[k];

        for (i = 0; i < k; i++) {
            vet[i] = 0;
        }

        // Percorrer a matriz k vezes para recuperar os k maiores, preenchendo com -1 os
        // maiores ja encontrados
        while (cont < k) {

            maior = mat[0][0];

            for (i = 0; i < 10; i++) {
                for (j = 0; j < 10; j++) {
                    if (mat[i][j] > maior) {
                        maior = mat[i][j];
                    }
                }
            }

            for (i = 0; i < 10; i++) {
                for (j = 0; j < 10; j++) {
                    if (mat[i][j] == maior) {
                        mat[i][j] = -1;
                    }
                }
            }

            vet[cont] = maior;
            cont++;
        }

        System.out.printf("Os %d maiores sao:\n", k);

        for (i = 0; i < k; i++) {
            System.out.printf("%d\n", vet[i]);
        }

    }

}
