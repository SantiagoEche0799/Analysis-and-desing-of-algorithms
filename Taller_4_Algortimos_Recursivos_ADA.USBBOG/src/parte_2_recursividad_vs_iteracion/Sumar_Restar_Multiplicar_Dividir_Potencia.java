package parte_2_recursividad_vs_iteracion;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Sumar_Restar_Multiplicar_Dividir_Potencia {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER FACTOR: ");
        int num1 = input.nextInt();
        System.out.print("INGRESE EL SEGUNDO FACTOR: ");
        int num2 = input.nextInt();

        System.out.println("\n*************OPERACIONES ITERATIVAS********************");
        System.out.println("SUMA ITERATIVA: " + sumaIterativa(num1, num2));
        System.out.println("RESTA ITERATIVA: " + restaIterativa(num1, num2));
        System.out.println("MULTIPLICACION ITERATIVA: " + multiplicacionIterativa(num1, num2));
        System.out.println("DIVISION ITERATIVA: " + divisionIterativa(num1, num2));
        System.out.println("POTENICA DE " + num1 + " A LA " + num2 + " ITERATIVO " + potenciaIterativa(num1, num2));
        System.out.println("\n*************OPERACIONES CON RECURSIVIDAD********************");
        System.out.println("SUMA RECURSIVA: " + sumaRecursiva(num1, num2));
        System.out.println("RESTA RECURSIVA: " + restaRecursiva(num1, num2));
        System.out.println("MULTIPLICACION RECURSIVA: " + multiplicacionRecursiva(num1, num2));
        System.out.println("DIVISION RECURSIVA: " + divisionRecursiva(num1, num2));
        System.out.println("POTENCIA DE " + num1 + " A LA " + num2 + " RECURSIVO: " + potenciaRecursiva(num1, num2));

    }

    //Forma iterativa Suma
    public static int sumaIterativa(int sumando1, int sumando2) {
        int suma = sumando1 + sumando2;
        return suma;
    }

    //Forma iterativa Resta
    public static int restaIterativa(int minuendo, int sustraendo) {
        int resta = minuendo - sustraendo;
        return resta;
    }

    //Forma iterativa division
    public static int divisionIterativa(int dividendo, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        int division = dividendo / divisor;
        return division;
    }

    //Forma iterativa multiplicacion
    public static int multiplicacionIterativa(int factor1, int factor2) {
        int multiplicacion = factor1 * factor2;
        return multiplicacion;
    }

    //Forma iterativa Potencia
    public static int potenciaIterativa(int base, int exponente) {
        int potencia = (int) Math.pow(base, exponente);
        return potencia;
    }

    //Forma recursiva Suma
    public static int sumaRecursiva(int sumando1, int sumando2) {
        if (sumando2 == 0) {
            return sumando1;
        } else if (sumando1 == 0) {
            return sumando2;
        } else {
            return 1 + sumaRecursiva(sumando1, sumando2 - 1);
        }
    }

    //Forma recursiva Resta
    static int restaRecursiva(int minuendo, int sustraendo) {
        if (minuendo > sustraendo) {
            return 1 + restaRecursiva(minuendo, sustraendo + 1);
        }
        if (sustraendo > minuendo) {
            return -1 + restaRecursiva(minuendo + 1, sustraendo);
        } else {
            return 0;
        }
    }

    //Forma recursiva Multiplicacion
    public static int multiplicacionRecursiva(int multiplicando, int multiplicador) {
        if (multiplicador == 1 || multiplicador == 0) {

            if (multiplicador == 0) {
                return 0;
            } else {
                return multiplicando;
            }

        } else {
            return multiplicando + multiplicacionRecursiva(multiplicando, multiplicador - 1);
        }
    }

    //Forma recursiva Dividision
    private static int divisionRecursiva(int dividendo, int divisor) {
        if (divisor > dividendo || divisor == 0) {
            return 0;
        } else {
            return 1 + divisionRecursiva(dividendo - divisor, divisor);
        }
    }

    //Forma recursiva Potencia
    private static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }

}
