/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uri_online_judge;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Salario {

    private static Scanner entrada;

    /**
     *
     * @author Santiag_Echeverri_D.
     * @param args
     */
    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        //Declaracion y lectura de las variables 
        int num_Empleado = 0;
        int num_horasTrabajo = 0;
        float monto_XHoraf = 0;
        float salariof;

        try {

            num_Empleado = entrada.nextInt();
            num_horasTrabajo = entrada.nextInt();
            monto_XHoraf = entrada.nextFloat();

        } catch (Exception e) {

            System.out.println(e + " Solo números.");
        }

        //Proceso 
        salariof = (float) num_horasTrabajo * monto_XHoraf;

        //Salida
        System.out.println("NUMBER = " + num_Empleado);
        System.out.printf("SALARY = U$ " + "%.2f%n", salariof);

    }

}
