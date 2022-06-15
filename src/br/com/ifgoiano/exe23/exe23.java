package br.com.ifgoiano.exe23;

import java.math.BigDecimal;
import java.util.Scanner;

public class exe23 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o salário:");
            BigDecimal salario = sc.nextBigDecimal();
            System.out.println("Digite o percentual de reajuste:");
            Double percentual = sc.nextDouble();
            salario = reajuste(salario, percentual);

            System.out.println("O novo salário é: R$ " + salario);
        }
    }

    public static BigDecimal reajuste(BigDecimal salario, Double indiceReajuste) {
        return salario.add(salario.multiply(BigDecimal.valueOf(indiceReajuste / 100)));
    }

}
