package com.ejercicios.tema2;

public class precioMain {

    public static void main(String[] args){

        double iva = 19;// porcentaje del iva
        double precio = 5500; // valor del producto
        double preciototal = calcularPrecioIva(precio, iva);
        System.out.println("Precio total del producto: " + preciototal );

    }

    static double calcularPrecioIva(double precio, double iva){
        double ivaProducto = precio * ( iva / 100 );
        return precio + ivaProducto;
    }


}
