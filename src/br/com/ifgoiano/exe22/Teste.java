package br.com.ifgoiano.exe22;

import java.util.Scanner;

// 22. Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres 
// existente entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, 
// emitir mensagem de erro.
// ●   Exemplo: Digite 2 caracteres: J T
// ●   O número de caracteres entre eles é: 9

public class Teste {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
          't', 'u', 'v', 'x', 'w', 'y', 'z' };

      System.out.print("Digite a primeira letra: ");
      char letraUm = (char) scanner.nextLine().toLowerCase().charAt(0);
      int primeiraLetra = buscarLetra(letraUm, alfabeto);

      System.out.print("Digite a segunda letra: ");
      char letraDois = (char) scanner.nextLine().toLowerCase().charAt(0);
      int segundaLetra = buscarLetra(letraDois, alfabeto);

      int diferencas = segundaLetra - primeiraLetra;
      if (primeiraLetra >= 0 && segundaLetra >= 0 && diferencas >= 0) {
        System.out.println("O numero de caracteres existente entre as letras digitadas eh de: " + (diferencas - 1));
      } else {
        System.out.println("Erro: os caracteres digitados nao estao em ordem alfabetica.");
      }
    }
  }

  public static int buscarLetra(char variavel, char[] alfabeto) {
    int numero = 0;
    for (int x = 0; x < alfabeto.length; x++) {
      if (alfabeto[x] == variavel) {
        numero = x;
      }
    }
    return numero;
  }
}
