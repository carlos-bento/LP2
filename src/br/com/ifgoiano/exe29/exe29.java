package br.com.ifgoiano.exe29;

import java.util.Scanner;

public class exe29 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um valor decimal inteiro para converter ao equivalente em binário");
            int num = sc.nextInt();

            convertBinario(num);
        }
    }

    public static void convertBinario(int num) {
        int resto;
        String binario = "";
        int aux = num;

        if (num < 0) {
            num = num * -1;
            aux = num;
        }

        while (num > 0) {
            resto = num % 2;
            binario = resto + binario;
            num = num / 2;
        }

        System.out.println("O número " + aux + " em binário é " + binario);
    }

}
