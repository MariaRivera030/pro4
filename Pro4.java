/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro4;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Pro4 {

    public static void main(String[] args) {
       String[] nombres = new String[10];

        // Crear un escáner para capturar los nombres
        Scanner scanner = new Scanner(System.in);

        // Solicitar los nombres al usuario
        System.out.println("Por favor, ingresa los nombres de 10 compañeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Imprimir los nombres almacenados
        System.out.println("\nLos nombres ingresados son:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Compañero " + (i + 1) + ": " + nombres[i]);
        }

        // Cerrar el escáner
        scanner.close();
    }
}