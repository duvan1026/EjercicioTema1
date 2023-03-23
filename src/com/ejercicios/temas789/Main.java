package com.ejercicios.temas789;

public class Main {

    public static void main(String[] args){

        // Exercice 1
        String stringReverse = reverse("Hola Mundo");
        System.out.println(stringReverse);

        // Exercice 2
        String arrayBi[] = new String[2];

        arrayBi[0] = "Hola";
        arrayBi[1] = "Mundo";

        traverseArray(arrayBi);


        // Exercise 3
        int arrayIntBid[][] = {
                {1,2,3},
                {4,5,6}
        };

        printArrayInt(arrayIntBid);




    }

    public static String reverse(String texto){

        String cadenaInversa = "";

        for(int i = texto.length() - 1; i >= 0; i--){ // recorremos una cadena de texto
            cadenaInversa += texto.charAt(i);
        }

        return cadenaInversa;

    }

    public static void traverseArray(String array[]){

        for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
        }
    }

    public static void printArrayInt(int array[][]){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("fila: " + i + " Columna: " + j + " es igual a: " + array[i][j] );
            }
        }

    }
}
