/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dominacion_Bacteriana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        //cantidad de bacterias expuestas
        
        int bacteriasExpuestas = e.nextInt();
        // las areas donde se pueden encontrar las bacterias 
        
        for (int i = 0; i < bacteriasExpuestas; i++) {
            int area = e.nextInt();
            int[][] matriz = new int[area][area];

            //Realizar cuadrícula
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    matriz[j][k] = e.nextInt();
                }
            }

            //Dibujar cuadrícula
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    System.out.print("[" + matriz[j][k] + "]");
                }
                System.out.println("");
            }

            int contador1 = 0;
            //ciclo para sumar la cantidad de unos que hay en la matriz
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[j][k] == 1) {
                        contador1 += 1;
                    }
                }
            }

            System.out.println(contador1);
            
            /*
                este ciclo es para sumar los ceros que estan rodeados de unos
            */
            int contador2 = 0;
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[j][k] == 0) {//Proceso de si hay un 1 mire el de al lado, si es un 0.
                        if (validarCeros(matriz, j, k)) {
                            contador2 += 1;
                        }else{
                            contador2 += 1;
                            contador2 -= 1;
                        }
                    }
                }
            }
            System.out.println(contador2);
        }
    }

//    static int sumarCeros(int matriz[][]) {
//
//        int suma = 0;
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//
//                if (matriz[i][j] == 1 && j < matriz.length) {
//                    if (matriz[i][j] == 0) {
//
//                    }
//
//                }
//            }
//        }
//
//        return suma;
//    }

    
    /*
        Este metodo es para verificar si un cero tiene unos a su izquierda a su derehca 
        arriba y abajo
    */
    static boolean validarCeros(int matriz[][], int posicion1, int posicion2) {
        boolean verificador = false;
        for (int i = posicion2; i < matriz.length; i++) {
            if (matriz[posicion1][i] == 1) {
                i = matriz.length;
                for (int j = posicion1 - 1; j >= 0; j--) {//Proceso para evaluar si arriba del 0 hay un 1, si j es -1 sale del bucle.
                    if (matriz[j][posicion2] == 1) {
                        j = -1;
                        for (int k = posicion1 + 1; k < matriz.length; k++) {
                            if (matriz[k][posicion2] == 1) {
                                k = matriz.length + 1;
                                verificador = true;
                            }
                        }
                    }
                }
            }
        }
        return verificador;
    }
    
}
