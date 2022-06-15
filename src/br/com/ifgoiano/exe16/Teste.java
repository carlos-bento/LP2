package br.com.ifgoiano.exe16;

import java.util.Scanner;

// 16. Uma agência de publicidade precisa encontrar uma modelo que tenha idade entre 18 e 20 anos para 
// participar de uma campanha. Foram inscritas 10 candidatas, fornecendo nome e idade. Tais informações 
// foram armazenadas em 2 vetores distintos. Faça um programa que imprima o vetor que contém os nomes 
// das candidatas aptas a concorrer a uma vaga para a campanha.

public class Teste {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      int candidatasInscritas = 10;
      int candidatasAptas = 0;
      String[] nome = new String[candidatasInscritas];
      int[] idade = new int[candidatasInscritas];

      for (int x = 0; x < candidatasInscritas; x++) {
        System.out.print("Digite o nome da candidata numero " + (x + 1) + ": ");
        nome[x] = scanner.nextLine();
        System.out.print("Digite a idade da candidata numero " + (x + 1) + ": ");
        idade[x] = Integer.parseInt(scanner.nextLine());

        if (idade[x] >= 18 && idade[x] <= 20) {
          candidatasAptas++;
        }
      }

      String[] nomeCandidatasAptas = new String[candidatasAptas];
      int[] idadeCandidatasAptas = new int[candidatasAptas];
      int y = 0;

      for (int x = 0; x < candidatasInscritas; x++) {
        if (idade[x] >= 18 && idade[x] <= 20) {
          nomeCandidatasAptas[y] = nome[x];
          idadeCandidatasAptas[y] = idade[x];
          y++;
        }
      }

      for (int x = 0; x < candidatasAptas; x++) {
        System.out.println("\nCandidata apta numero " + (x + 1) + ": ");
        System.out.printf("Nome: %s\nIdade: %d\n", nomeCandidatasAptas[x], idadeCandidatasAptas[x]);
      }

      if (candidatasAptas == 0) {
        System.out.println("\nNao existem candidatas aptas para esta campanha");
      }

    } catch (NumberFormatException e) {
      e.printStackTrace();
    }

  }
}
