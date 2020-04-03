package ejercicio1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Internship {

    private static Scanner e;
	private static double resultado;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        e = new Scanner(System.in);
        try {
            Integer contador = e.nextInt();
            if (contador >= 1 && contador <= 40) {
                Integer num1, num2, sumatoria1 = 0, sumatoria2 = 0;
                boolean verificador = true;
                for (int i = 0; i < contador; i++) {
                    num1 = e.nextInt();
                    num2 = e.nextInt();
                    if (num1 >= 0 && num1 <= 100 && num2 >= 30 && num2 <= 120) {
                        sumatoria1 += (num1 * num2);
                        sumatoria2 += num2;
                    } else {
                        verificador = false;
                        break;
                    }
                }
                if (verificador) {
                    System.out.println("");
                    DecimalFormatSymbols separador = new DecimalFormatSymbols();
                    separador.setDecimalSeparator('.');
                    DecimalFormat formato = new DecimalFormat("0.0000", separador);
                    System.out.println(formato.format(resultado = (double) sumatoria1 / (sumatoria2 * 100)));
                } else {
                    System.out.println("ERROR, valores ingresados no válidos");
                }
            } else {
                System.out.println("ERROR, valor ingresado no válido");
            }
        } catch (Exception o) {
            System.out.println("ERROR, valor ingresados no válidos");
        }

    }

}
