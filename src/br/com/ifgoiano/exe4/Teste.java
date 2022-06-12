package br.com.ifgoiano.exe4;

import java.util.Scanner;

public class Teste {

  // 4. Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A
  // passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os
  // valores trocados.

  private static int valorA;
  private static int valorB;

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      int valorA;
      int valorB;

      System.out.println("Digite o valor de A: ");
      valorA = (scanner.nextInt());
      System.out.println("Digite o valor de B: ");
      valorB = (scanner.nextInt());

      Teste novoValor = new Teste();
      novoValor.setValorA(valorB);
      novoValor.setValorB(valorA);

      System.out.println("Os valores invertidos são: A= " + getValorA() + " e B = " + getValorB());
    }
  }

  public static int getValorB() {
    return valorB;
  }

  public void setValorB(int valorB) {
    Teste.valorB = valorB;
  }

  public static int getValorA() {
    return valorA;
  }

  public void setValorA(int valorA) {
    Teste.valorA = valorA;
  }

}
