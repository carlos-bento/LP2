package br.com.ifgoiano.exe25;

import java.util.Scanner;

// 25. Escreva um programa que receba valores inteiros e os distribua em uma matriz quadrada. O tamanho da 
// matriz deve ser informado pelo usuário. Depois troque os valores das linhas e colunas. Exemplo: o valor que 
// estiver na linha 2, coluna 3, passa a estar na linha 3, coluna 2.

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int linha = 0, coluna = 0;
    int matriz[][] = new int[linha][coluna];

    System.out.printf("Informe a quantidade de linhas da matriz:\n");
    linha = scanner.nextInt();

    System.out.printf("Informe a quantidade de colunas da matriz:\n");
    coluna = scanner.nextInt();

    int y = 0;
    int x = 0;
    for (x = 0; x < linha; x++) {
      for (y = 0; y < coluna; y++) {
        System.out.printf("m[%d][%d] = ", linha, coluna);
        matriz[linha][coluna] = scanner.nextInt();
      }
      System.out.printf("\n");
    }

    System.out.printf("\n");
    for (x = 0; x < linha; x++) {
      System.out.printf("%da. linha: ", (linha + 1));
      for (y = 0; y < coluna; y++) {
        System.out.printf("%d ", matriz[linha][coluna]);
      }
      System.out.printf("\n");
    }
  }
}
