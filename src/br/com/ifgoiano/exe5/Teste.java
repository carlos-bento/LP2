package br.com.ifgoiano.exe5;

import java.util.Scanner;

public class Teste {

    // 5. Escreva um programa que leia um número inteiro e exiba o seu módulo. O módulo de um número x é:
    // ●   x se x é maior ou igual a zero
    // ●   x * (-1) se x é menor que zero

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro");
            Integer valor = scan.nextInt();

            if (valor >= 0) {
                System.out.println("O número é: " + valor);
            } else {
                System.out.println("O módulo de " + valor + " é: " + valor * -1);
            }
        }

    }

}
