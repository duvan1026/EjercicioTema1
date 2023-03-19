package com.ejercicios.tema4;

public class SmartPhone extends SmartDevide{

    String sistemaOperativo;
    String resolucionPantalla;
    int resolucionCamaraDelantera;
    int getResolucionCamaraTrasera;
    int memoriaRam;
    boolean dualSim;
    boolean detectorHuella;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String procesador, int memoriaInterna, boolean resistenteAgua, String sistemaOperativo, String resolucionPantalla, int resolucionCamaraDelantera, int getResolucionCamaraTrasera, int memoriaRam, boolean dualSim, boolean detectorHuella) {
        super(marca, modelo, procesador, memoriaInterna, resistenteAgua);
        this.sistemaOperativo = sistemaOperativo;
        this.resolucionPantalla = resolucionPantalla;
        this.resolucionCamaraDelantera = resolucionCamaraDelantera;
        this.getResolucionCamaraTrasera = getResolucionCamaraTrasera;
        this.memoriaRam = memoriaRam;
        this.dualSim = dualSim;
        this.detectorHuella = detectorHuella;
    }
}
