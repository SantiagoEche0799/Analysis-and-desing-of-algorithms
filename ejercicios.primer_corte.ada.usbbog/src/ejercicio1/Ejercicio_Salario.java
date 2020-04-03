package ejercicio1;

import java.util.Scanner;

public class Ejercicio_Salario {
	


	private static Scanner entrada;

	/**
	 *
	 * @author Santiag_Echeverri_D.
	 */

	    public static void main(String[] args) {

	        entrada = new Scanner(System.in);

	        //Declaracion y lectura de las variables 
	        int num_Empleado=0;
	        int num_horasTrabajo=0;
	        float monto_XHoraf=0;
	        float salariof=0;

	        try {
	        	
	            num_Empleado = entrada.nextInt();
	            num_horasTrabajo = entrada.nextInt();
	            monto_XHoraf = entrada.nextFloat();
	            
	        } catch (Exception e) {
	        	
	            System.out.println(e+" Solo números.");
	        }

	        //Proceso 
	        salariof = (float)num_horasTrabajo * monto_XHoraf;

	        //Salida
	        System.out.println("NUMBER = " + num_Empleado);
	        System.out.printf("SALARY = U$ " + "%.2f%n", salariof);

	    }

	}



//public boolean Validacion(String cadena) {
//
//    int num;
//
//    try {
//        num = Integer.parseInt(cadena);
//        return true;
//    } catch (Exception e) {
//        return false;
//    }
//}


