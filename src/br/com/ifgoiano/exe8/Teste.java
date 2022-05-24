package br.com.ifgoiano.exe8;

import java.util.Scanner;

// 8. Faça um programa para imprimir a tabuada de um número digitado pelo usuário.

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer valor;

        System.out.println("Digite um número qualquer");
        valor = scan.nextInt();

        System.out.println("A tabuada do número: " + valor + " é: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }

}