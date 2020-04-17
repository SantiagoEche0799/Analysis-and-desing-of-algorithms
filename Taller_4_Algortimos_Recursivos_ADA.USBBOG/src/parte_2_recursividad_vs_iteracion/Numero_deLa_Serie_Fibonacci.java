package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Numero_deLa_Serie_Fibonacci {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Ingrese un número de la serie Fibonacci para calcular: ");
        int numero = input.nextInt();
        System.out.println("Fibonacci de " + numero + ", de forma iterativa es:" + fibonacciIteracion(numero));
        System.out.println("Fibonacci de " + numero + ", de forma recursiva es:" + fibonacciRecursividad(numero));
    }

    //Metodo Fibonacci Iterativo
    public static int fibonacciIteracion(int numero) {
        if (numero < 2) {
            return numero;
        }
        int fibonacci = 1;
        int fibonacciAnterior = 1;

        for (int i = 2; i < numero; i++) {
            int temporal = fibonacci;
            fibonacci += fibonacciAnterior;
            fibonacciAnterior = temporal;
        }
        return fibonacci;
    }

    //Metodo Fibonacci Recursivo 
    public static int fibonacciRecursividad(int n) {
        if (n < 2) { //Caso base
            return n;
        }
        return fibonacciRecursividad(n - 1) + fibonacciRecursividad(n - 2);
    }

}
