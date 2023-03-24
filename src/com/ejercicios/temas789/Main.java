package com.ejercicios.temas789;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args){

        // Exercice 0
        String stringReverse = reverse("Hola Mundo");
        System.out.println(stringReverse);

        // Exercice 1
        String arrayBi[] = new String[2];

        arrayBi[0] = "Hola";
        arrayBi[1] = "Mundo";

        traverseArray(arrayBi);


        // Exercise 2
        int arrayIntBid[][] = {
                {1,2,3},
                {4,5,6}
        };

        printArrayInt(arrayIntBid);


        // Exercise 3
        Vector vector = new Vector<String>();

        vector.add("Element0");
        vector.add("Element1");
        vector.add("Element2");
        vector.add("Element3");
        vector.add("Element4");

        int[] positionDeleteArray = { 2, 1};

        removePositionVector(vector,positionDeleteArray);


        // Exercise 4
        /**
         * El problema radica en que al crear un Vector con tamaño por defecto en 1000 elementos
         * estariamos ocupando un espacio en memoria muy grande, con un almacenamiento que no puede disminuir
         * sino por el contrario, aumentaría si el numero de elementos a manejar se excede de esa capacidad, aumentaria nuevamente 1000 elementos
         * volviendolo un metodo podo eficiente para el manejo de datos.
         */

        // Exercise 5
        ArrayList<String> arrayString = new ArrayList<String>();

        arrayString.add("Element1");
        arrayString.add("Element2");
        arrayString.add("Element3");
        arrayString.add("Element4");

        LinkedList<String> linkedListString = new LinkedList<>();
        linkedListString.addAll(arrayString);

        printArrayList(arrayString);
        printLinkedList(linkedListString);

        // Exercise 6
        createArrayListIntegerOddNumbers(10);

        // Excersise 7
        DividePorCero(7,0);

        // Exercise 8
        String fileInput = "fileln.txt";
        String fileOutput = "fileOut.txt";
        copyFile(fileInput,fileOutput);




    }

    /**
     * Metodo que lee bytes de un fichero y los copia en otro fichero asignado.
     * @param fileInput fichero de lectura
     * @param fileOutput fichero de escritura
     */
    public static void  copyFile( String fileInput, String fileOutput ){

        try{
            InputStream in = new FileInputStream(fileInput);
            byte[] datos = in.readAllBytes();
            in.close();// cierra el fichero

            PrintStream out = new PrintStream(fileOutput);// fichero destino
            out.write(datos);
            out.close();// cierra el fichero

        }catch(Exception e){
            System.out.println("Exception:" + e.getMessage());
        }

    }

    /**
     * metodo que dispara una excepcion si no es posble realizar la operacion aritmetica
     * @param a numero 1
     * @param b numero 2
     * @throws ArithmeticException
     */
    public static void DividePorCero(int a, int b) throws  ArithmeticException{
        int result = 0;
        try{
            result = a / b;
            System.out.println("result : " + result);
        }catch(ArithmeticException e ){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

    /**
     * Metodo que crea un arraylist con elementos enteros en orden descendiente e imprime solo los numeros impares
     * @param elements numero de elementos del arraList
     */
    public static void createArrayListIntegerOddNumbers(int elements){

        ArrayList<Integer> arrayListInt = new ArrayList<Integer>();

        for(int i= 0; i <= elements; i++){
            if(i%2 != 0)
                arrayListInt.add(i);
        }

        System.out.println(arrayListInt);

    }

    public static void printArrayList( ArrayList<String> arrayStr ){

        for(String element: arrayStr){
            System.out.println(element);
        }
    }
    public static void printLinkedList(LinkedList<String> linkedListString){
        for(String element: linkedListString){
            System.out.println(element);
        }
    }



    /**
     * Metodo que elimina un elemento de un vector en una posicion especifica
     * @param vector vector a tratar
     * @param elementDelete array de numeros de posiciones a eliminar
     */
    public static void removePositionVector(Vector vector, int[] elementDelete){

        int[] positionDelete = elementDelete;
        Arrays.sort(positionDelete);

        if(positionDelete[0] >= vector.size()){
            System.out.println(" Posicion no encontrada, por favor revisa las psoiciones a eliminar ");
        }else {
            for( int i = positionDelete.length - 1; i >= 0; i--){
                vector.remove(positionDelete[i]);
            }
        }
        System.out.println(vector);
    }

    /**
     * Metodo que devuelve un string con sus caracteres en orden inverso
     * @param texto string
     * @return string con caracteres en orden inverso
     */
    public static String reverse(String texto){

        String cadenaInversa = "";

        for(int i = texto.length() - 1; i >= 0; i--){ // recorremos una cadena de texto
            cadenaInversa += texto.charAt(i);
        }

        return cadenaInversa;
    }

    /**
     * metodo que recorre un array y lo imprime
     * @param array
     */
    public static void traverseArray(String array[]){

        for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
        }
    }

    /**
     * Metodo que recorre un array bidimensional y lo imprime con su respectivo indice de fila y columna
     * @param array
     */
    public static void printArrayInt(int array[][]){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("fila: " + i + " Columna: " + j + " es igual a: " + array[i][j] );
            }
        }

    }
}
