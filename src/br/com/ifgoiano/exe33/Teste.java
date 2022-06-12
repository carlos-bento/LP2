package br.com.ifgoiano.exe33;

import java.util.Scanner;

public class Teste {

    //33. Implementar uma classe Data que deve possuir como características os atributos dia, mês e ano (todas
    //do tipo inteiro). Nesta classe além dos métodos construtores, getters, setters e toString, deverá ser
    //implementado o método validarData (int, int, int): boolean que deverá disparar uma exceção caso as
    //informações passadas por parâmetros sejam inválidas. Este método deverá inclusive verificar se é ano
    //bissexto. O método toString deverá retornar uma string no seguinte formato “dia/mês/ano”, como por exemplo
    //“05/março/2015”

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int dia = 0, mes = 0, ano = 0;
        Data d = new Data();
        boolean validar = false;

        while(validar == false){

            System.out.printf("Digite o dia: ");
            dia = ler.nextInt();

            System.out.printf("Digite o mes: ");
            mes = ler.nextInt();

            System.out.printf("Digite o ano: ");
            ano = ler.nextInt();

            validar = d.isValidarData(dia, mes, ano);

            if(validar == false){
                System.out.printf("Data invalida\n");
            }

        }

        d.setDia(dia);
        d.setMes(mes);
        d.setAno(ano);
        System.out.printf(""+d.toString());
    }

}
