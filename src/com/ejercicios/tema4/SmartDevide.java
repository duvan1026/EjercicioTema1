package com.ejercicios.tema4;

public class SmartDevide {

    String marca;
    String modelo;
    String Procesador;
    int memoriaInterna;
    boolean ResistenteAgua;

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
