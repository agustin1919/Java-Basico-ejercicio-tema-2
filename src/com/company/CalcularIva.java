package com.company;
import java.util.Scanner;
public class CalcularIva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("El precio es: ");
        double precio = scanner.nextInt();
        System.out.println(calcularIva(precio));
    }
    public static double calcularIva(double precio){
        double iva = 0.21;
        double totalIva = precio * iva;
        return totalIva + precio;

    }
}
