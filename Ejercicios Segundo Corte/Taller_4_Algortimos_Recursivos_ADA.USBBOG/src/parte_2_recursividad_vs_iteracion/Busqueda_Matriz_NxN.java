package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Busqueda_Matriz_NxN {

    static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        String elemento, cadenaABuscar;

        System.out.print("Escriba el tamaño de la matriz NxN: ");
        int tam = input.nextInt();
        String matriz[][] = new String[tam][tam];

        System.out.println("Digite los elementos de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + i + "][" + j + "]= ");
                elemento = input.next();
                matriz[i][j] = elemento;
            }
        }

        System.out.print("\nIngrese el elemento a buscar en la matriz NxN: ");
        cadenaABuscar = input.next();

        System.out.println("\n************Busuqeda de forma Recursiva****************");
        if (busquedaMatrizRecursivo(matriz, cadenaABuscar, 0, 0)) {
            System.out.println("El elemento: " + cadenaABuscar + ". SI se encuentra en la matriz.");
        } else {
            System.out.println("El elemento: " + cadenaABuscar + ". NO se encuentra en la mtriz");
        }

        System.out.println("\n************Busqueda de forma Iterativa****************");
        if (busquedaMatrizIterativo(matriz, cadenaABuscar)) {
            System.out.println("El elemento: " + cadenaABuscar + ". SI se encuentra en la matriz.");
        } else {
            System.out.println("El elemento: " + cadenaABuscar + ". NO se encuentra en la mtriz");

        }
    }

    //Buscar un elemento tipo String en una Matriz de forma Iterativa
    public static boolean busquedaMatrizIterativo(String[][] matrix, String elementoCadena) {

        boolean verificador = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equalsIgnoreCase(elementoCadena)) {
                    verificador = true;
                    break;
                }
            }
        }
        return verificador;
    }

    //Buscar un elemento tipo String en una Matriz de forma Recursiva
    //i son las filas en la matriz. j son las columnas en la matriz
    public static boolean busquedaMatrizRecursivo(String[][] matrix, String 
            elementoCadena, int i, int j) {
        if (matrix[i][j].equalsIgnoreCase(elementoCadena)) {
            return true;
        } else {
            if (i != matrix.length - 1 || j != matrix.length - 1) {
                if (j == matrix.length - 1) {
                    i = i + 1;
                    j = 0;
                } else {
                    j = j + 1;
                }
                return busquedaMatrizRecursivo(matrix, elementoCadena, i, j);
            }
            return false;
        }
    }
}
