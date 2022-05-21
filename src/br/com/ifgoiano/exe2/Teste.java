package br.com.ifgoiano.exe2;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        Double cotacao, valorInicial, valorFinal;
        System.out.println ( "Digite a Cotação do Dólar: " );
        cotacao = sc.nextDouble ( );
        System.out.println ( "Digite o Valor em Dólar: " );
        valorInicial = sc.nextDouble ( );

        valorFinal = valorInicial * cotacao;
        System.out.println ( "Valor em Real: R$" + valorFinal );
    }

}
