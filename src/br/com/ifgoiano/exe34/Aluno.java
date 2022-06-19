package br.com.ifgoiano.exe34;

public class Aluno extends Teste {
  private int matricula;

  public Aluno(String nome, String sobrenome, int matricula) {
    super(nome, sobrenome);
    this.matricula = matricula;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
}
