package br.com.ifgoiano.exe18;

import java.util.Random;
import java.util.Scanner;

public class Teste {

    //18. Fazer um programa que sorteie um número de 0 a 100 e peça para que o usuário (sem conhecer o
    //número sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem informando se o
    //número sorteado é maior ou menor que a tentativa feita. Deixe que o usuário tente até acertar o número e
    //imprima a quantidade de tentativas feitas.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int numTentativas = 0;
        int numEscolhido = -1;
        int sorteado = gerador.nextInt(100);


        while(numEscolhido != sorteado){
            numTentativas++;
            System.out.printf("Digite um numero:\n");
            numEscolhido = ler.nextInt();
            if(numEscolhido > sorteado){
                System.out.printf("Numero digitado maior\n");
            }
            else if(numEscolhido < sorteado){
                System.out.printf("Numero digitado menor\n");
            }
        }

        System.out.printf("Escolhido numero sorteado, quantidades de tentativas: %d\n", numTentativas);


    }
}
