package br.com.ifgoiano.exe6;

import java.util.Scanner;

// 6. Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor lido multiplicado pelo maior e o maior valor dividido pelo menor.

public class Teste {

    public static void main(String[] args) {
        try (Scanner receber = new Scanner(System.in)) {

            int a = 0, b = 0, c = 0;
            int menorValor = 0;
            int maiorValor = 0;
            int checar = 0; // inicializando variavel

            System.out.println("Verificando valores");

            // for (int i = 0; i < 3; i++) {
            // System.out.println("Digite um valor " + (i + 1) + ":");
            // valor[i] = receber.nextInt();

            // while (valor[i] <= 0) {
            // System.out.println("Digite um valor " + (i + 1) + " que seja maior do que
            // 0:");
            // valor[i] = receber.nextInt();
            // }
            // }

            System.out.println("Digite um valor para A:");
            a = receber.nextInt();
            if (a <= 0) {
                System.out.println("Digite um valor para A que seja maior do que 0:");
                a = receber.nextInt();
            }

            System.out.println("Digite um valor para B:");
            b = receber.nextInt();
            if (b <= 0) {
                System.out.println("Digite um valor para B que seja maior do que 0:");
                b = receber.nextInt();
            }

            System.out.println("Digite um valor para C:");
            c = receber.nextInt();
            if (c <= 0) {
                System.out.println("Digite um valor para C que seja maior do que 0:");
                c = receber.nextInt();
            }

            int[] valor = { a, b, c };
            menorValor = valor[0];
            maiorValor = valor[0];

            for (int i = 0; i < valor.length; i++) {
                checar += valor[i];

                if (menorValor > valor[i])
                    menorValor = valor[i];

                if (maiorValor < valor[i])
                    maiorValor = valor[i];

            }

            System.out.println("Maior valor multiplicado pelo o menor valor: " + maiorValor * menorValor);
            System.out.println("Maior valor divido pelo menor valor: " + maiorValor / menorValor);

        }
    }
}
