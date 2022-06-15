package br.com.ifgoiano.exe13;

// 13. Uma rainha requisitou os serviços de um monge. O monge indagou à rainha se o pagamento poderia ser 
// feito com grãos de trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro quadro deveria 
// conter apenas um grão e os quadros subseqüentes, o dobro do quadro anterior. Faça um programa, usando 
// laços de repetição, para calcular o número de grãos que o monge esperava receber.

public class Teste {
  public static void main(String[] args) {

    int graos = 1;
    double graosTabuleiro = 1, casasTabuleiro = 64;

    for (int x = 1; x < casasTabuleiro; x++) {
      graosTabuleiro = graosTabuleiro * 2;
      graos += graosTabuleiro;
    }

    System.out.println("A quantidade de graos eh: " + graos);
  }
}
