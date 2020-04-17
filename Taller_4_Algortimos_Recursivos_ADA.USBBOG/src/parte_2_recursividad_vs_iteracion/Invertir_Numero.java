package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Invertir_Numero {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        int numero = input.nextInt();
        
        System.out.print("Ingrese las unidades del numero anterior: ");
        int unidades = input.nextInt();
        
        System.out.println("Invertir numero forma recursiva\n" + invertirNumeroRecursiva(numero, unidades - 1));
        System.out.println("Invertir numero forma iterativa\n" + invertirNumeroIterativa(numero));
    }

    //Forma iterativa de invertir un numero 
    public static int invertirNumeroIterativa(int numero) {

        String cadena = "";

        for (int i = String.valueOf(numero).length() - 1; i >= 0; i--) {
            cadena += String.valueOf(numero).charAt(i);//Tomalos caracteres d eun String y los guarda en la variable "cadena" 
        }
        return Integer.parseInt(cadena);//Convierte de cadena a numero
    }

    //Forma Recursiva de invertir numero 
    public static int invertirNumeroRecursiva(int numero, int unidades) {

        if (numero < 10) { //Caso base
            return numero;
        } else {
            return (numero % 10) * (int) Math.pow(10, unidades) + (invertirNumeroRecursiva(numero / 10, unidades - 1));
            /*
             8 * 
            
            
            */
        }
    }

}
