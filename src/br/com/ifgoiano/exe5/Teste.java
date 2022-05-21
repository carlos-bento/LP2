package br.com.ifgoiano.exe5;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner ( System.in );

        System.out.println ( "Digite um número inteiro" );
        Integer valor = scan.nextInt ( );

        if (valor >= 0){
            System.out.println ( "O número é: " + valor );
        } else {
            System.out.println ( "O módulo de " + valor + " é: " + valor * -1 );
        }

    }

}
