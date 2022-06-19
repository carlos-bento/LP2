package br.com.ifgoiano.exe34;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// 34. Implemente as classes representadas no diagrama abaixo e crie uma classe de testes para instanciar os 
// objetos das classes e exibir seus dados no console. Exibir as informações de cada instância usando o método 
// toString da sua classe. Crie uma instância da classe Aluno, serialize-a e salve como arquivo físico em uma 
// pasta do computador.

public class Teste implements java.io.Serializable {
  String nome, sobrenome;

  public Teste(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public String getNome() {
    return this.nome;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public static void main(String[] args) {
    Teste e = null;
    try {
      FileInputStream fileIn = new FileInputStream("C:/Windows/Temp/testeArquivo");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      e = (Teste) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException i) {
      i.printStackTrace();
      return;
    } catch (ClassNotFoundException c) {
      System.out.println("A classe Teste nao foi encontrada");
      c.printStackTrace();
      return;
    }

    System.out.println("Desserializando...");
    System.out.println("get nome: " + e.getNome());
    System.out.println("get sobrenome: " + e.getSobrenome());

  }
}