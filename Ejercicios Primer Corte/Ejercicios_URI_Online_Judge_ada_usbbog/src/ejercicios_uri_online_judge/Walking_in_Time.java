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
public class Walking_in_Time {

    private static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        int viaje1 = entrada.nextInt();
        int viaje2 = entrada.nextInt();
        int viaje3 = entrada.nextInt();

        if ((viaje1 + viaje2) == viaje3) {
            System.out.println("S");

        } else if ((viaje2 + viaje3) == viaje1) {
            System.out.println("S");

        } else if ((viaje1 + viaje3) == viaje2) {
            System.out.println("S");

        } else if (viaje1 == viaje2) {
            System.out.println("S");

        } else if (viaje2 == viaje3) {
            System.out.println("S");

        } else if (viaje1 == viaje3) {
            System.out.println("S");

        } else {
            System.out.println("N");
        }

    }

}
