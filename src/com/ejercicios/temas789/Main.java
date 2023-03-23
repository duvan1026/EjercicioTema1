package com.ejercicios.temas789;

public class Main {

    public static void main(String[] args){

        String stringReverse = reverse("Hola Mundo");
        System.out.println(stringReverse);
    }

    public static String reverse(String texto){

        String cadenaInversa = "";

        for(int i = texto.length() - 1; i >= 0; i--){ // recorremos una cadena de texto
            cadenaInversa += texto.charAt(i);
        }

        return cadenaInversa;

    }
}
