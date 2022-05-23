package br.com.ifgoiano.exe1;

import java.util.Scanner;

public class Teste {

    // 1. Faça um programa para calcular o estoque médio de uma peça, sendo que:
    // 𝑒𝑠𝑡𝑜𝑞𝑢𝑒𝑀𝑒𝑑𝑖𝑜 = (𝑞𝑢𝑎𝑛𝑡𝑖𝑑𝑎𝑑𝑒𝑀𝑖𝑛𝑖𝑚𝑎 +
    // 𝑞𝑢𝑎𝑛𝑡𝑖𝑑𝑎𝑑𝑒𝑀𝑎𝑥𝑖𝑚𝑎)/2. Receba as quantidades via teclado.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double estoqueMedio, quantidadeMinima, quantidadeMaxima;

        System.out.println("Digite a quantidade mínima: ");
        quantidadeMinima = scanner.nextDouble();
        System.out.println("Digite a quantidade máxima: ");
        quantidadeMaxima = scanner.nextDouble();

        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("O estoque médio é de: R$" + estoqueMedio);
    }
}
