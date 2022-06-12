package br.com.ifgoiano.exe3;

import java.util.Scanner;

public class Teste {

    // 3. Escrever um programa que leia três números inteiros e mostre todos os relacionamentos de ordem
    // existentes entre eles. Os relacionamentos possíveis  são: Igual, Não igual, Maior, Menor, Maior ou igual,
    // Menor ou igual.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.printf("Informe o segundo valor.: ");
        b = ler.nextInt();

        System.out.printf("Informe o terceiro valor.: ");
        c = ler.nextInt();


        if(a==b){
            System.out.printf("%d igual %d\n", a, b);
        }
        else if(a>b){
            System.out.printf("%d Nao igual %d\n", a, b);
            System.out.printf("%d maior que %d\n", a, b);
        }
        else{
            System.out.printf("%d Nao igual %d\n", a, b);
            System.out.printf("%d menor que %d\n", a, b);
        }

        if(b==c){
            System.out.printf("%d igual %d\n", b, c);
        }
        else if(b>c){
            System.out.printf("%d Nao igual %d\n", b, c);
            System.out.printf("%d maior que %d\n", b, c);
        }
        else{
            System.out.printf("%d Nao igual %d\n", b, c);
            System.out.printf("%d menor que %d\n", b, c);
        }

        if(a==c){
            System.out.printf("%d igual %d\n", a, c);
        }
        else if(a>c){
            System.out.printf("%d Nao igual %d\n", a, c);
            System.out.printf("%d maior que %d\n", a, c);
        }
        else{
            System.out.printf("%d Nao igual %d\n", a, c);
            System.out.printf("%d menor que %d\n", a, c);
        }

    }
}