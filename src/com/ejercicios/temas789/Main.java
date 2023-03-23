package com.ejercicios.temas789;

public class Main {

    public static void main(String[] args){

        // Exercice 1
        String stringReverse = reverse("Hola Mundo");
        System.out.println(stringReverse);

        // Exercice 2
        String arrayBi[][] = new String[2][3];

        arrayBi[0][0] = "Hola";
        arrayBi[0][1] = "Mundo";
        arrayBi[0][2] = "Tierra";

        arrayBi[1][0] = "Duvan";
        arrayBi[1][1] = "Castro";
        arrayBi[1][2] = "bautista";

        traverseArray(arrayBi);


    }

    public static String reverse(String texto){

        String cadenaInversa = "";

        for(int i = texto.length() - 1; i >= 0; i--){ // recorremos una cadena de texto
            cadenaInversa += texto.charAt(i);
        }

        return cadenaInversa;

    }

    public static void traverseArray(String array[][]){

        for(int i = 0; i < array.length; i++){
            for(int j= 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
