package br.com.ifgoiano.exe21;

import java.util.Scanner;

public class Teste {

    // 21. Fazer um programa para armazenar em um vetor, vários números inteiros e
    // positivos e calcular a média
    // destes. Imprimir também o maior valor. A quantidade de números lidos será
    // definida pelo usuário.

    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
            int Tam;
            int media = 0;
            int maior = -1;

            System.out.printf("Digite a quantidade de numeros que deseja digitar:\n");
            Tam = ler.nextInt();

            int vet[] = new int[Tam];

            for (int i = 0; i < Tam; i++) {
                System.out.printf("Digite um numero:\n");
                vet[i] = ler.nextInt();
            }

            for (int i = 0; i < Tam; i++) {
                if (vet[i] > maior) {
                    maior = vet[i];
                }
                media = media + vet[i];
            }

            System.out.printf("Media e igual a : %d e o maior e %d\n", media / Tam, maior);
        }

    }
}
