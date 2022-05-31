package br.com.ifgoiano.exe6;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);
        Double[] valor = new Double[3];
        System.out.println("Verificando valores");

        for (int i = 0; i < 3; i++){
            System.out.println("Digite um valor " + (i+1) + ":");
            valor[i] = receber.nextDouble();

            while (valor[i] <= 0){
                System.out.println("Digite um valor maior que 0 " + (i+1) + ":");
                valor[i] = receber.nextDouble();
            }

        }
        Arrays.sort(valor);
        System.out.println("Maior valor multiplicado pelo o menor valor: "+valor[0]*valor[2]+" " + "Maior valor divido pelo menor valor: " +valor[0]/valor[2]);
    }

}
