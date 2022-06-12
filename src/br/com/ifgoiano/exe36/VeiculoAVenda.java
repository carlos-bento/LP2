package br.com.ifgoiano.exe36;

public class VeiculoAVenda {

    String tipo, marca, modelo;
    int ano;
    double precoDeVenda;

    public VeiculoAVenda(String tipo, String marca, String modelo, int ano, double precoDeVenda) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDeVenda = precoDeVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public interface situacaoVeiculo{
        void vendido();
    }


}

