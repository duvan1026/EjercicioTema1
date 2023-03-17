package com.ejercicios.tema3;

public class ejerciciomain {

    public static void main(String[] args){

        String[] nombres = {"Duvan", "Castro", "Bautista", "Dario"};
        String nombreCompleto = "";
        String espacio = " ";

        for( int i = 0; i < nombres.length; i++ ){
            nombreCompleto = nombreCompleto + espacio + nombres[i] ;
        }

        System.out.println( nombreCompleto );

    }

}
