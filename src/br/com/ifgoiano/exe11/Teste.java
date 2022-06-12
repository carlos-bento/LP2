package br.com.ifgoiano.exe11;

import java.util.Scanner;

public class Teste {

    //11. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são
    //altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice
    //sobe para 0,3 as indústrias do 1° grupo são intimadas a suspenderem suas atividades, se o índice crescer
    //para 0,4 as indústrias do 1°o e 2° grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5
    //todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que leia o índice
    //de poluição medido e emita a notificação adequada aos diferentes grupos de empresas. O algoritmo só deve
    //parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?"

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
