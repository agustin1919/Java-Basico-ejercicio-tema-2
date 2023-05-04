package com.company;

public class CalcularIva {
    public static void main(String[] args) {
        // El iva es el 21%
        System.out.println(calcularIva(10));
        System.out.println(calcularIva(100));
        System.out.println(calcularIva(1000));
    }
    public static double calcularIva(double precio){
        double iva = 0.21;
        double totalIva = precio * iva;
        return totalIva + precio;

    }
}
