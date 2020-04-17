package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Minimo_deUn_Vector {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Ingrese la longutud del array: ");
        int longitud = input.nextInt();
        int[] array = new int[longitud];

        System.out.println("Ingresando los elmentos del array");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + "= ");
            array[i] = input.nextInt();
        }

        System.out.println("El minimo de un vector de forma iterativa es: " + numeroMenorIterativo(array));
        System.out.println("El minimo de un vector de forma recursiva es: " + numeroMenorRecursivo(array, 0, array[0]));
        
    }

    // Forma iterativa minimo de un vector
    public static int numeroMenorIterativo(int[] vector) {

        int minimo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        return minimo;
    }

    //Forma recursiva minimo de un vector
    public static int numeroMenorRecursivo(int[] vectorNum, int indice, int minimo) {

        if (indice != vectorNum.length) {
            if (vectorNum[indice] < minimo) {
                minimo = numeroMenorRecursivo(vectorNum, indice + 1, vectorNum[indice]);
            } else {
                minimo = numeroMenorRecursivo(vectorNum, indice + 1, minimo);
            }
        }
        return minimo;
    }

}
