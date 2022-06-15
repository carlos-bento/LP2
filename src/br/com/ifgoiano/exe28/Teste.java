package br.com.ifgoiano.exe28;

// 28. Escreva um programa Java para encontrar o k-ésimo elemento menor e k-ésimo maior em um 
// determinado array multidimensional. Os elementos na matriz podem estar em qualquer ordem.

public class Teste {
  public static void main(String[] args) {
    int[][] numeros = { { 15, 14, 13, 12, 11 }, { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 20, 19, 18, 17, 16 } };
    int minimo;
    int maximo;

    for (int i = 0; i < numeros.length; i++) {
      minimo = numeros[i][0];
      maximo = numeros[i][0];
      for (int j = 0; j < numeros[i].length; j++) {
        if (numeros[i][j] < minimo) {
          minimo = numeros[i][j];
        }
        if (numeros[i][j] > maximo) {
          maximo = numeros[i][j];
        }
      }
      System.out.println("Min: " + minimo + " Max: " + maximo);
    }
  }
}
