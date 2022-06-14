package br.com.ifgoiano.exe3;

import java.util.Scanner;

// 3. Escrever um programa que leia três números inteiros e mostre todos os relacionamentos de ordem 
// existentes entre eles. Os relacionamentos possíveis  são: Igual, Não igual, Maior, Menor, Maior ou igual, 
// Menor ou igual.

public class Teste {

    public static void main(String[] args) {

        try (Scanner recebe = new Scanner(System.in)) {
            int[] numeros = new int[3];

            int igualValor = 0;
            int naoigualValor = 0;
            int maiorValor = 0;
            int menorValor = 0;
            int maiorouigualValor = 0;
            int menorouigualValor = 0;

            int checar = 0; // iniciando a variavel

            System.out.println("Verificador de relacionamentos");

            for (int i = 0; i < 3; i++) {
                System.out.println("Informe o " + (i + 1) + " valor: ");
                numeros[i] = recebe.nextInt();
            }

            igualValor = numeros[0];
            naoigualValor = numeros[0];
            menorValor = numeros[0];
            maiorValor = numeros[0];
            maiorouigualValor = numeros[0];
            menorouigualValor = numeros[0];

            for (int i = 0; i < numeros.length; i++) {

                checar += numeros[i];

                if (igualValor == numeros[i])
                    igualValor = numeros[i];

                if (naoigualValor != numeros[i])
                    naoigualValor = numeros[i];

                if (menorValor > numeros[i])
                    menorValor = numeros[i];

                if (maiorValor < numeros[i])
                    maiorValor = numeros[i];

                if (maiorouigualValor <= numeros[i])
                    maiorouigualValor = numeros[i];

                if (menorouigualValor >= numeros[i])
                    menorouigualValor = numeros[i];
            }

            System.out.println("");
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("");
            System.out.println("Valor maior ou igual aos outros: " + maiorouigualValor);
            System.out.println("Valor menor ou igual aos outros: " + menorouigualValor);
            System.out.println("");
            System.out.println("Valores que sao iguais: " + igualValor);
            System.out.println("Valores que nao sao iguais: " + naoigualValor);
        }

    }
}