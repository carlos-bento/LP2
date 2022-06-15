package br.com.ifgoiano.exe36;

public class AutomovelAVenda extends VeiculoAVenda implements VeiculoAVenda.situacaoVeiculo {


    public AutomovelAVenda(String tipo, String marca, String modelo, int ano, double precoDeVenda) {
        super(tipo, marca, modelo, ano, precoDeVenda);

        this.tipo = "Automovel";
    }

    public void vendido(){
        System.out.printf("O veiculo do tipo "+this.tipo+" feito pela "+marca+" modelo "+modelo+" e ano "+ano+"foi vendido por R$"+precoDeVenda);
    }


}