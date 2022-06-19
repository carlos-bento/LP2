package br.com.ifgoiano.exe34;

public class Professor extends Teste {
  private String disciplina;

  public Professor(String nome, String sobrenome, String disciplina) {
    super(nome, sobrenome);
    this.disciplina = disciplina;
  }

  public String getDisciplina() {
    return this.disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }
}
