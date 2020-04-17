package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Sumar_Elementos_de_Vector {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de elementos que desea que tenga el array: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Ingresando los elmentos al array");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + "= ");
            array[i] = input.nextInt();
        }
        
        System.out.println("Suma de los elementos del vector de forma iterativa es: " + sumaVectorIterativa(array));
        System.out.println("Suma de los elementos del vector de forma recursiva es: " + sumaVectorRecursiva(0, array.length - 1, array));
        
    }

    //Suma los elementos de un vector de forma iterativa
    public static int sumaVectorIterativa(int array[]) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    //Sumar los elementos de un vector de forma recursiva
    public static int sumaVectorRecursiva(int inicio, int fin, int[] array) {
        if (inicio == fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int mitad1 = sumaVectorRecursiva(inicio, mitad, array);
            int mitad2 = sumaVectorRecursiva(mitad + 1, fin, array);
            return mitad1 + mitad2;
        }
    }

}
