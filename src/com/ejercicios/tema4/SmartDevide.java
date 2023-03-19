package com.ejercicios.tema4;

public class SmartDevide {

    protected String marca;
    protected String modelo;
    protected String Procesador;
    protected int memoriaInterna;
    protected boolean ResistenteAgua;

    public SmartDevide(){
    }

    public SmartDevide(String marca, String modelo, String procesador, int memoriaInterna, boolean resistenteAgua) {
        this.marca = marca;
        this.modelo = modelo;
        Procesador = procesador;
        this.memoriaInterna = memoriaInterna;
        ResistenteAgua = resistenteAgua;
    }
}
