package com.ejercicios.tema4;

public class SmartWatch extends SmartDevide{

    String materialCorrea;
    char tallaCorrea;
    int largoCorrea;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String procesador, int memoriaInterna, boolean resistenteAgua, String materialCorrea, char tallaCorrea, int largoCorrea) {
        super(marca, modelo, procesador, memoriaInterna, resistenteAgua);
        this.materialCorrea = materialCorrea;
        this.tallaCorrea = tallaCorrea;
        this.largoCorrea = largoCorrea;
    }
}
