package br.com.ifgoiano.exe20;

import java.util.Locale;
import java.util.Scanner;

public class exe20 {

    public static void main(String[] args) {

        String frase = "";
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Digite uma frase: " );
        frase = sc.nextLine ( );

        contaVogais ( frase );

    }

    public static void contaVogais(String frase) {

        String[] vogais = {"A", "E", "I", "O", "U"};
        String vogaisDaFrase = "";
        frase = frase.toUpperCase ( Locale.ROOT );

        for (int i = 0; i < frase.length ( ); i++) {

            if (frase.charAt ( i ) == 'a' || frase.charAt ( i ) == 'e' || frase.charAt ( i ) == 'i' || frase.charAt ( i ) == 'o' || frase.charAt ( i ) == 'u' || frase.charAt ( i ) == 'A' || frase.charAt ( i ) == 'E' || frase.charAt ( i ) == 'I' || frase.charAt ( i ) == 'O' || frase.charAt ( i ) == 'U') {
                vogaisDaFrase += frase.charAt ( i ) + ", ";
            }
        }

        System.out.println ( "Vogais: " + vogaisDaFrase );

    }

}
