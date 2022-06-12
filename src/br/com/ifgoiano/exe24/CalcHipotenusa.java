package br.com.ifgoiano.exe24;

import static java.lang.Math.sqrt;

public class CalcHipotenusa {

    double hipotenusa;

    public CalcHipotenusa() {

    }

    public void setCalcHipotenusa(float a, float b){
        hipotenusa = sqrt((a*a) + (b*b));
    }

    public double getCalcHipotenusa(){
        return hipotenusa;
    }

}
