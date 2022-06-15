package br.com.ifgoiano.exe10;

import java.util.Scanner;

// 10. Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par 
// ou ímpar, e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na 
// seguinte pergunta, “Deseja encerrar o programa?”

public class Teste {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      float numero;
      char program = 'N';

      while (program == 'N' || program == 'n') {

        System.out.printf("Digite um numero: ");
        numero = scanner.nextFloat();

        if ((numero % 2) == 0)
          System.out.println("- O numero eh par");
        else
          System.out.println("- O numero eh impar");

        if (numero > 0)
          System.out.println("- O numero eh positivo");
        if (numero < 0)
          System.out.println("- O numero eh negativo");
        if (numero == 0)
          System.out.println("- O numero eh considerado neutro");

        String checar;
        System.out.printf("Deseja encerrar o programa? Digite S para sim ou N para nao \n");
        checar = scanner.next();

        program = checar.charAt(0);

      }
    }
  }
}
