package br.com.ifgoiano.exe33;

public class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {

    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }


    public boolean isValidarData(int dia, int mes, int ano) {
        if (dia > 31 || dia < 1) {
            return false;
        }
        if (mes > 12 || mes < 1) {
            return false;
        }
        return true;
        /*bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)
        não entendi como é a verificação do ano bissexto nesse metodo*/
    }

    public String toString() {
        if (this.mes == 1) {
            return dia + "/Janeiro/" + ano;
        }
        if (this.mes == 2) {
            return dia + "/Fereveiro/" + ano;
        }
        if (this.mes == 3) {
            return dia + "/Março/" + ano;
        }
        if (this.mes == 4) {
            return dia + "/Abril/" + ano;
        }
        if (this.mes == 5) {
            return dia + "/Maio/" + ano;
        }
        if (this.mes == 6) {
            return dia + "/Junho/" + ano;
        }
        if (this.mes == 7) {
            return dia + "/Julho/" + ano;
        }
        if (this.mes == 8) {
            return dia + "/Agosto/" + ano;
        }
        if (this.mes == 9) {
            return dia + "/Setembro/" + ano;
        }
        if (this.mes == 10) {
            return dia + "/Outubro/" + ano;
        }
        if (this.mes == 11) {
            return dia + "/Novembro/" + ano;
        }
        if (this.mes == 12) {
            return dia + "/Dezembro/" + ano;
        } else {
            return "Data inválida";
        }
    }
}