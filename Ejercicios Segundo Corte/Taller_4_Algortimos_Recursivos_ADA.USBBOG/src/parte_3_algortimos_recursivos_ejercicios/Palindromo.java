package parte_3_algortimos_recursivos_ejercicios;

import java.util.Scanner;

public class Palindromo {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Ingrese una palabra para saber si es palindrmo o no: ");
        String palabra = input.next();
        System.out.println(validar_Si_es_Palindromo(palabra));
    }

    public static String validar_Si_es_Palindromo(String palindrmo) {
        if (palindrmo.length() <= 1) {
            return "La cadena es Palidromo";
        } else {
            //Si la letra de la posicion inicial 0 es igual a la letra de la ultima
            if (palindrmo.charAt(0) == palindrmo.charAt(palindrmo.length() - 1)) {
                /*Se evalua el substring con la misma funcion, teniendo en 
                    cuenta que inicia desde 1 hasta el tamaño del substring*/
                return validar_Si_es_Palindromo(palindrmo.substring(1, palindrmo.length() - 1));
            } else {
                return "La cadena no es Palidromo";
            }
        }
    }

}
