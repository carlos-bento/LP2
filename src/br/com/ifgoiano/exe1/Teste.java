package br.com.ifgoiano.exe1;

import java.util.Scanner;

public class Teste {

    // 1. FaΓ§a um programa para calcular o estoque mΓ©dio de uma peΓ§a, sendo que:
    // ππ π‘πππ’ππππππ = (ππ’πππ‘πππππππππππ + ππ’πππ‘ππππππππ₯πππ)/2. Receba as quantidades via teclado.

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Double estoqueMedio, quantidadeMinima, quantidadeMaxima;

            System.out.println("Digite a quantidade mΓ­nima: ");
            quantidadeMinima = scanner.nextDouble();
            System.out.println("Digite a quantidade mΓ‘xima: ");
            quantidadeMaxima = scanner.nextDouble();

            estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
            System.out.println("O estoque mΓ©dio Γ© de: R$" + estoqueMedio);
        }
    }
}
