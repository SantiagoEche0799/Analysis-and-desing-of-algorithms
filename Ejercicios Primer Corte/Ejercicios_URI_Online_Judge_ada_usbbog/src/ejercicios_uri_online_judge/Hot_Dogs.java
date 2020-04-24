/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uri_online_judge;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hot_Dogs {

    private static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);
        int consumedHotDogs = entrada.nextInt();
        int participants = entrada.nextInt();
        double hotDogsXParticipants;

        if (!((consumedHotDogs == 0) || (participants == 0))) {
            hotDogsXParticipants = (double) consumedHotDogs / participants;
            DecimalFormatSymbols seperadorPersonalizado = new DecimalFormatSymbols();
            seperadorPersonalizado.setDecimalSeparator('.');
            DecimalFormat formato1 = new DecimalFormat("0.00", seperadorPersonalizado);
            System.out.println(formato1.format(hotDogsXParticipants));
        } else {
            System.out.println("los valores ingresados tienen que ser mayor a cero");
        }

//	        System.out.printf("%.2f%n", hotDogsXParticipants);
    }

}
