package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

public class Calcular_Factorial_Numero {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Ingrese el numero a calccular su Factorial: ");
        int numero = input.nextInt();
        System.out.println("El factorial de "+numero+" de fomra RECURSIVA  es: "+factorialRecursivo(numero));
        System.out.println("El factorial de "+numero+" de fomra RECURSIVA  es: "+factorialRecursivo(numero));
    }

    //Forma iterativa calcular el factorial de un nùmero
    public static int factorialIterativo(int num) {

        int factorial = 1;
        for (int i = 1; i < num; i++)
        {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }

    //Forma recursiva calcular el factorial de un nùmero
    public static int factorialRecursivo(int num) {
        int factorial;
        if (num == 1) { //Condicion Base
            return 1;
        } else {
            factorial = factorialRecursivo(num - 1) * num; //Llamada recursiva
        }
        return factorial;
    }
}
