package br.com.ifgoiano.exe24;

import java.util.Scanner;

public class Teste {

    //24. Escreva um programa que calcule e retorne o valor da hipotenusa através de um método

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float catAdj, catOpo;


        System.out.printf("Digite o cateto adjacente:");
        catAdj = ler.nextFloat();

        System.out.printf("Digite o cateto oposto:");
        catOpo = ler.nextFloat();

        CalcHipotenusa hip = new CalcHipotenusa();
        hip.setCalcHipotenusa(catOpo, catOpo);
        System.out.printf("A Hipotenusa e %f:", hip.getCalcHipotenusa());

    }
}
