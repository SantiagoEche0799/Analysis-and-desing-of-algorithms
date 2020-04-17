
package parte_3_algortimos_recursivos_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutaciones {
    public static String[] array;
    public static ArrayList<String> arrayPermutaciones = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese una combinacion de letras para permutar: ");
        String cadena = lector.next();
        array = new String[cadena.length()];
        cadena_a_Arreglo(array, cadena, 0);
        permutacion(arrayPermutaciones, array, "", array.length, array.length, 0);
        System.out.println("*****************PERMUTACIONES*****************");
        imprimirArrayList(arrayPermutaciones);

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
                permutacion(permutaciones, letras, actual, n, r, index+1);
            }
            return permutaciones;
        }
        return permutaciones;
    }
    
}
