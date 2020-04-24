/*
    Ejercicio 3: BASIC E
 */
package usbbog.ada.parcial2.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Generating_Fast_Sorted_Permutation {

    public static String[] array;
    public static ArrayList<String> arrayPermutaciones = new ArrayList<String>();
    static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        int casos = input.nextInt();

        while (!(casos == 0)) {

            input = new Scanner(System.in);
            String cadena = input.next();
            array = new String[cadena.length()];
            cadena_a_Arreglo(array, cadena, 0);
            permutacion(arrayPermutaciones, array, "", array.length, array.length, 0);
            Collections.sort(arrayPermutaciones);
            imprimirArrayList(arrayPermutaciones);
            System.out.println("");

            casos = casos - 1;

            for (int i = 0; i < cadena.length(); i++) {
                array[i] = null;
            }

            arrayPermutaciones.clear();
            cadena = null;

        }

    }

    public static void ordenarAlfabeticamente(ArrayList permutaciones) {
        permutaciones.sort((Comparator) permutaciones);
    }

    public static String[] cadena_a_Arreglo(String[] letras, String entrada, int i) {

        if (i < letras.length) {
            letras[i] = String.valueOf(entrada.charAt(i));
            i = i + 1;
            return cadena_a_Arreglo(letras, entrada, i);
        }
        return letras;
    }

    public static void imprimirArrayList(ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("[" + array.get(i) + "]");
        }
    }

    public static ArrayList permutacion(ArrayList permutaciones, String[] letras,
            String actual, int n, int r, int index) {
        if (n == 0) {
            permutaciones.add(actual);
        } else {
            if (index != r) {
                //SI atcual es diferente de lo que contiene la primera posición del arregloCadena. 
                if (!actual.contains(letras[index])) {
                    permutacion(permutaciones, letras, actual + letras[index], n - 1, r, 0);
                }
                permutacion(permutaciones, letras, actual, n, r, index + 1);
            }
            return permutaciones;
        }
        return permutaciones;
    }

}
