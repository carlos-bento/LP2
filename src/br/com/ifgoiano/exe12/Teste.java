package br.com.ifgoiano.exe12;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {

    //12. Faça um programa que determine o maior e o menor entre N números lidos e armazenados em um array
    //unidimensional. A condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar executando
    //até que a entrada seja igual a 0 (ZERO).

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int[] array;
        int num;
        int maior, menor;

        System.out.printf("Digite um numero:\n");
        num = ler.nextInt();
        list.add(num);

        maior = num;
        menor = num;

        while(num != 0){



            System.out.printf("Digite um numero:\n");
            num = ler.nextInt();
            list.add(num);

            if(num > maior){
                maior = num;
            }
            if(num < menor && num != 0){
                menor = num;
            }

        }
        System.out.printf("Maior numero digitado %d\n", maior);
        System.out.printf("Menor numero digitado %d\n", menor);
        System.out.println("Finalizado programa (Digitado numero 0)");
    }
}
