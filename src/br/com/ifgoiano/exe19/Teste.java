package br.com.ifgoiano.exe19;

import java.util.Scanner;

// 19. Fazer um programa que leia uma frase de até 50 caracteres e imprima a frase sem os espaços em 
// branco. Imprimir também a quantidade de espaços em branco da frase.

public class Teste {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      String fraseDigitada;
      String fraseRefatorada = "";

      do {
        System.out.print("Digite uma frase de ate 50 characteres: ");
        fraseDigitada = scanner.nextLine();
      } while (fraseDigitada.length() > 50);

      char[] fraseArray = fraseDigitada.toCharArray();
      int contadorEspacos = 0;

      for (int x = 0; x < fraseArray.length; x++) {
        if (fraseArray[x] != ' ') {
          fraseRefatorada = fraseRefatorada + fraseArray[x];
        }
        if (fraseArray[x] == ' ') {
          contadorEspacos++;
        }
      }
      System.out.println();
      System.out.println("Frase com os espacos retirados: " + fraseRefatorada);
      System.out.println("Quantidade de espacos retirados: " + contadorEspacos);
    }

  }
}
