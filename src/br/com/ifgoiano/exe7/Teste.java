package br.com.ifgoiano.exe7;

import java.util.Scanner;

// 7. Escreva um programa que leia:
// ●   a quantidade de números que deverá processar;
// ●   os números que deverão ser processados, calcule e exiba, para cada número a ser  processado, o 
// seu fatorial
// Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N

public class Teste {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    int quantidadeNumeros;
    Double resultado = 1.0;

    System.out.print("Digite a quantidade de numeros a serem processados: ");
    quantidadeNumeros = scanner.nextInt();
    Double[] numeros = new Double[quantidadeNumeros];

    for (int x = 0; x < numeros.length; x++) {
      System.out.print("Digite um numero: ");
      numeros[x] = scanner.nextDouble();
    }

    for (int x = 0; x < numeros.length; x++) {
      for (Double y = numeros[x]; y > 0; y--) {
        resultado = y * resultado;
      }
      System.out.println("O fatorial de " + numeros[x] + " e: " + resultado);
      System.out.printf("O fatorial de %.0f eh igual a %.2f %n", numeros[x], resultado);
    }

  }
}
