package br.com.ifgoiano.exe11;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sair = "";

        while ( !(sair).equalsIgnoreCase ( "S" ) ) {
            recebeIndice ( );
            System.out.println ( "Deseja sair? (S para sair e N para não)" );
            sair = sc.next ( );
        }

    }

    public static void recebeIndice() {
        try {
            Scanner sc = new Scanner ( System.in );
            System.out.println ( "Digite o índice de poluíção medido:" );
            Double indice = sc.nextDouble ( );
            verificaIndice ( indice );
        } catch (Exception e) {
            System.out.println ( "Erro: o valor digitado deve ser um número! Erro: " + e.getMessage ( ) );
            recebeIndice ( );
        }
    }

    public static void verificaIndice(Double indice) {

        if (indice >= 0.3 && indice < 0.4) {
            System.out.println ( "Indústrias do primeiro grupo devem suspender atividades!" );
        } else if (indice >= 0.4 && indice < 0.5) {
            System.out.println ( "Indústrias do primeiro e do segundo grupo devem suspender atividades!" );
        } else if (indice >= 0.5) {
            System.out.println ( "Indústrias de todos os grupos devem suspender atividades!" );
        } else {
            System.out.println ( "Não há necessidade de suspensão de atividades!" );
        }

    }

}
