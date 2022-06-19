package br.com.ifgoiano.exe32;

import java.util.Scanner;

// 32. Implementar uma classe Lampada  que deve possuir como características tipo (led, fluorescente,...), 
// voltagem, cor, marca, preço, potência, status (boolean). Nesta classe devem ser implementados os métodos 
// construtores, getters, setters, toString, acender e apagar. Em uma outra classe chamada Teste  deverá ser 
// criado uma lista para armazenar 30 objetos do tipo Lampada. No programa deve ser possível:
// ●   Cadastrar lâmpada
// ●   Exibir todas as lâmpadas
// ●   Exibir quantidade de lâmpadas cadastradas
// ●   Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
// ●   Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
// ●   Exibir a quantidade de lâmpadas acesas e apagadas

public class Teste {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int limiteLampada = 30, quantidadeLampada = 0, opcoes;
      Lampada[] lampadas = new Lampada[limiteLampada];
      do {
        System.out.println(
            "Digite uma das seguntes opções:\n\t1: Cadastrar lampadas\n\t2: Exibir todas as lampadas\n\t3: Exibir quantidade de lampadas cadastradas\n\t4: Consultar quantidade de lampadas de uma determinada potência\n\t5: Exibir os dados das lampadas com preço menor do que o preço medio das lampadas cadastradas\n\t6: Exibir a quantidade de lampadas acesas e apagadas\n\t0: Encerrar programa");
        opcoes = Integer.parseInt(scanner.nextLine());
        switch (opcoes) {
          case 1:
            if (quantidadeLampada >= limiteLampada) {
              System.out.println("O numero maximo de lampadas cadastradas eh 30");
            } else {
              String tipo, cor, marca;
              int voltagem;
              boolean status;
              double preco, potencia;

              System.out.print("Digite o tipo da lampada(led, fluorescente,...): ");
              tipo = scanner.nextLine();
              System.out.print("Digite a cor da lampada: ");
              cor = scanner.nextLine();
              System.out.print("Digite a marca da lampada: ");
              marca = scanner.nextLine();
              System.out.print("Digite a voltagem da lampada: ");
              voltagem = Integer.parseInt(scanner.nextLine());
              System.out.print("Digite o preco da lampada: ");
              preco = Double.parseDouble(scanner.nextLine());
              System.out.print("Digite a potencia da lampada: ");
              potencia = Double.parseDouble(scanner.nextLine());

              lampadas[quantidadeLampada] = new Lampada(tipo, voltagem, cor, marca, preco, potencia, false);
              quantidadeLampada++;
            }
            break;
          case 2:
            for (int x = 0; x < quantidadeLampada; x++) {
              System.out.println(lampadas[x].toString());
            }
            break;
          case 3:
            System.out.println("Quantidade de lampadas cadastradas: " + quantidadeLampada);
            break;
          case 4:
            System.out.print("Insira a potencia a ser buscada: ");
            double potenciaBuscada = Double.parseDouble(scanner.nextLine());
            int quantidadeEncontrada = 0;
            for (int x = 0; x < quantidadeLampada; x++) {
              if (lampadas[x].getPotencia() == potenciaBuscada) {
                quantidadeEncontrada++;
              }
            }
            System.out
                .println("Existem " + quantidadeEncontrada + " lampadas com a potencia " + potenciaBuscada);
            break;
          case 5:
            double mediaPreco = 0;
            int x;
            for (x = 0; x < quantidadeLampada; x++) {
              mediaPreco += lampadas[x].getPreco();
            }
            mediaPreco = mediaPreco / x;
            for (int y = 0; y < quantidadeLampada; y++) {
              double precoAtual = lampadas[y].getPreco();
              if (precoAtual < mediaPreco) {
                System.out.println(lampadas[y].toString());
              }
            }
            break;
          case 6:
            int lampadasAcesas = 0, lampadasApagadas = 0;
            for (x = 0; x < quantidadeLampada; x++) {
              if (lampadas[x].getStatus())
                lampadasAcesas++;
              else
                lampadasApagadas++;
            }
            System.out.println("Quantidade de lampadas acesas: " + lampadasAcesas
                + "\nQuantidade de lampadas apagadas: " + lampadasApagadas);
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
