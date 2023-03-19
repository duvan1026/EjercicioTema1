package com.ejercicios.tema4;

public class main {

    public static void main(String[] args){

        SmartDevide xiaomi = new SmartPhone("Xiaomi","Redmi Note 11", "Qualcomm", 128, true, "Android", "FHD", 13,50,4,true,true);
        System.out.println(xiaomi.marca + xiaomi.modelo);

        xiaomi = new SmartWatch("Xiaomi","Redmi Watch 2 lite","Na",2,true,"TPU",'L',21);
        System.out.println(xiaomi.marca + xiaomi.modelo + xiaomi.ResistenteAgua);

    }

}
