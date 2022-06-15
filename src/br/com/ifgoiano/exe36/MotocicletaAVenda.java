package br.com.ifgoiano.exe36;

public class MotocicletaAVenda extends VeiculoAVenda implements VeiculoAVenda.situacaoVeiculo {

    public MotocicletaAVenda(String tipo, String marca, String modelo, int ano, double precoDeVenda) {
        super(tipo, marca, modelo, ano, precoDeVenda);
        this.tipo = "Motocicleta";
    }

    public void vendido(){
        System.out.printf("A moto do tipo "+this.tipo+" feito pela "+marca+" modelo "+modelo+" e ano "+ano+"foi vendido por R$"+precoDeVenda);
    }


}
