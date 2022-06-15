package br.com.ifgoiano.exe30;

import java.util.Random;

public class Teste {

    // 30. Escreva um programa Java para mover todos os números positivos para a
    // direita e todos os números
    // negativos para a esquerda de um determinado array de inteiros.

    public static void main(String[] args) {

        int i, cont = 0;
        Random gerador = new Random();
        int vet[] = new int[10];
        int vetAjustado[] = new int[10];

        System.out.printf("Vetor inicial:\n");
        for (i = 0; i < 10; i++) {
            vet[i] = gerador.nextInt();
            System.out.printf("%d\t", vet[i]);
        }

        // Armazenar menor que zero
        for (i = 0; i < 10; i++) {
            if (vet[i] < 0) {
                vetAjustado[cont] = vet[i];
                cont++;
            }
        }
        // Armazenar maior igual a zero
        for (i = 0; i < 10; i++) {
            if (vet[i] > 0) {
                vetAjustado[cont] = vet[i];
                cont++;
            }
        }

        System.out.printf("\nVetor ajustado:\n");

        for (i = 0; i < 10; i++) {
            System.out.printf("%d\t", vetAjustado[i]);
        }

    }

}
