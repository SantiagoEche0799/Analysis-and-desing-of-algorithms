package ejercicio2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Ejercicio_CombustibleGastado {
	
    private static Scanner lector;

	public static void main(String[] args) {
        
        lector = new Scanner(System.in);
        
        //Variables
        int hora, velocidad_media;
        float resultadof;
        
        //Constantes
        final int CANTIDAD_LITRO = 12;
        
        //Proceso
        //Lectores
        hora = lector.nextInt();
        velocidad_media = lector.nextInt();
        
        //Procedimiento para resolver el problema
        resultadof = (float) (hora * velocidad_media) / CANTIDAD_LITRO;
        DecimalFormatSymbols seperadorPersonalizados = new DecimalFormatSymbols();
        seperadorPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato1 = new DecimalFormat(".000", seperadorPersonalizados);
        System.out.println(formato1.format(resultadof));
//        System.out.printf("%.3f%n", resultadof);
    }

}
