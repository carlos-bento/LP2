package br.com.ifgoiano.exe14;

import java.util.ArrayList;
import java.util.Scanner;

public class exe14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        ArrayList<Integer> numeros = new ArrayList<> ( );
        String sair = "";
        int aux = 0;

        while ( !(sair).equalsIgnoreCase ( "S" ) ) {
            aux++;

            System.out.println ( "Digite um número inteiro: " );
            numeros.add ( sc.nextInt ( ) );

            if (aux >= 2) {
                System.out.println ( "Deseja sair? (S para sair e N para não)" );
                sair = sc.next ( );
            }
        }

        //System.out.println ( (isSquareMatrix ( numeros )) );
        printSquareMatrix ( numeros );

    }

    //create a method that will receive the arraylist and print square matrix
    public static void printSquareMatrix(ArrayList<Integer> numeros) {

        Integer[][] matriz = new Integer[numeros.size ( )][numeros.size ( )];
        int aux = 0;

        for (int i = 0; i < numeros.size ( ); i++) {
            for (int j = 0; j < numeros.size ( ); j++) {

                if(i > j){
                    if (numeros.get ( j ) == null ){
                        matriz[i][j] = 0;
                    }else{
                        matriz[i][0] = numeros.get ( i);
                        matriz[0][j] = numeros.get ( j);
                    }
                }
            }
        }

        for (int i = 0; i < numeros.size ( ); i++) {
            for (int j = 0; j < numeros.size ( ); j++) {
                System.out.print ( matriz[i][j] + " " );
            }
            System.out.println ( );
        }
    }

    //verify if arraylist form a square matrix
    public static boolean isSquareMatrix(ArrayList<Integer> numeros) {

        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numeros.size ( ); i++) {
            linha++;
            System.out.println ( "Linha: " + linha );
            for (int j = 0; j < numeros.size ( ); j++) {
                coluna++;
                System.out.println ( "Coluna: " + coluna );
            }
        }

        if (linha != coluna) {
            return false;
        }
        return true;
    }


}
