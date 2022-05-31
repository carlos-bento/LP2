package br.com.ifgoiano.exe3;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int a, b, c;
        Scanner recebe = new Scanner(System.in);
        boolean Igual = false, NaoIgual = false, Maior = false, Menor = false, MaiorOuIgual = false, MenorOuIgual = false;
        System.out.println("Verificador de relacionamentos");

        System.out.println("Digite um valor: ");
        a = recebe.nextInt();

        System.out.println("Digite um valor: ");
        b = recebe.nextInt();

        System.out.println("Digite um valor: ");
        c = recebe.nextInt();

        if (a == b) Igual = true;
        if (a == c) Igual = true;
        if (b == c) Igual = true;
        if (a != b) NaoIgual = true;
        if (a != c) NaoIgual = true;
        if (b != c) NaoIgual = true;
        if (a > b) Maior = true;
        if (a > c) Maior = true;
        if (b > c) Maior = true;
        if (a < b) Menor = true;
        if (a < c) Menor = true;
        if (b < c) Menor = true;

        System.out.println("Igual = " + Igual);
        System.out.println("NaoIgual = " + NaoIgual);
        System.out.println("Maior = " + Maior);
        System.out.println("Menor = " + Menor);

    }
}