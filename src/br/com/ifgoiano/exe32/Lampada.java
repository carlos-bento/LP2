package br.com.ifgoiano.exe32;

public class Lampada {
  private String tipo, cor, marca;
  private int voltagem;
  private double preco, potencia;
  private boolean status;

  public Lampada() {
  }

  public Lampada(String tipo, int voltagem, String cor, String marca, double preco, double potencia, boolean status) {
    this.tipo = tipo;
    this.voltagem = voltagem;
    this.cor = cor;
    this.marca = marca;
    this.preco = preco;
    this.potencia = potencia;
    this.status = status;
  }

  public String toString() {
    String texto = "Lâmpada:";
    texto += "\n\tTipo: " + this.tipo;
    texto += "\n\tVoltagem: " + this.voltagem;
    texto += "\n\tCor: " + this.cor;
    texto += "\n\tMarca: " + this.marca;
    texto += "\n\tPreco: " + this.preco;
    texto += "\n\tPotência: " + this.potencia;
    texto += "\n\tStatus: " + this.status;
    return texto;
  }

  public void acender() {
    setStatus(true);
  }

  public void apagar() {
    setStatus(false);
  }

  public String getTipo() {
    return this.tipo;
  }

  public int getVoltagem() {
    return this.voltagem;
  }

  public String getCor() {
    return this.cor;
  }

  public String getMarca() {
    return this.marca;
  }

  public double getPreco() {
    return this.preco;
  }

  public double getPotencia() {
    return this.potencia;
  }

  public boolean getStatus() {
    return this.status;
  }

  // setters
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
