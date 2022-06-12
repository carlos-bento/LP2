package br.com.ifgoiano.exe36;

public class Teste {

    //36. Escreva uma classe VeiculoAVenda que represente informações básicas sobre um veículo genérico
    //que esteja à venda, com o tipo, marca, modelo, ano e precoDeVenda.
    //● Escreva uma classe AutomovelAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com
    //o valor “Automóvel”;
    //● Escreva uma classe MotocicletaAVenda que herde de VeiculoAVenda e que inicialize o campo tipo
    //com o valor “Motocicleta”.
    //● Implemente um método vendido que mostre o tipo e o valor de venda do veículo. Use polimorfismo
    //para personalizar a mensagem de retorno desse método para cada tipo de veículo.
    //● Crie os construtores nas classes filhas de forma a atribuir atributos próprios e herdados.
    //● Dispare uma exceção caso sejam informados valores inválidos na inicialização dos atributo

    public static void main(String[] args) {

        AutomovelAVenda a = new AutomovelAVenda("","FORD","FOCUS",2006,35000);
        MotocicletaAVenda m = new MotocicletaAVenda("","HONDA","GC150",2012,7500);

        a.vendido();
        m.vendido();
    }
}