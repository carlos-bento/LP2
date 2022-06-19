package br.com.ifgoiano.exe31;

import java.util.Scanner;

// 31. Implementar uma classe Caneta  que deve possuir como características marca, cor e tamanho. Nesta 
// classe devem ser implementados os métodos construtores, getters, setters e toString. Em uma outra classe 
// chamada Teste  deverá ser criado uma lista para armazenar no máximo 50 objetos do tipo Caneta. No 
// programa deve ser possível:
// ●   Cadastrar caneta
// ●   Exibir todas as canetas
// ●   Exibir quantidade de canetas cadastradas
// ●   Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)

public class Teste {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Caneta[] canetas = new Caneta[50];
      int opcoes, quantidadeCanetas = 0;

      do {
        System.out.println(
            "Escolha uma das opcoes:\n\t1: Cadastrar caneta\n\t2: Exibir todas as canetas\n\t3: Exibir quantidade de canetas cadastradas\n\t4: Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)\n\t0: Sair");
        opcoes = Integer.parseInt(scanner.nextLine());

        switch (opcoes) {
          case 1:
            if (quantidadeCanetas >= 50) {
              System.out.println("Limite de 50 canetas atingido");
            } else {
              String marca, cor;
              int tamanho;
              System.out.print("Digite a marca da caneta: ");
              marca = scanner.nextLine();
              System.out.print("Digite a cor da caneta: ");
              cor = scanner.nextLine();
              System.out.print("Digite o tamanho da caneta: ");
              tamanho = Integer.parseInt(scanner.nextLine());
              canetas[quantidadeCanetas] = new Caneta(marca, cor, tamanho);
              quantidadeCanetas++;
            }
            break;
          case 2:
            for (int x = 0; x < quantidadeCanetas; x++) {
              System.out.print("Caneta cadastrada numero " + (x + 1) + ":");
              System.out.print(canetas[x].toString());
            }
            break;
          case 3:
            System.out.println("Quantidade de canetas cadastradas: " + quantidadeCanetas);
            break;
          case 4:
            String corProcurada;
            System.out.print("Digite a cor de caneta a ser buscada: ");
            corProcurada = scanner.nextLine();
            for (int x = 0; x < quantidadeCanetas; x++) {
              if (corProcurada.equals(canetas[x].getCor())) {
                System.out.println(canetas[x].toString());
              }
            }
            break;
          case 0:
            break;
          default:
            System.out.println("Essa opcao nao existe. Escolha uma opcao de 1 a 4, ou digite 0 para sair.");
        }
      } while (opcoes != 0);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
