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
public class A_Long_Long_Time_Ago {

    private static Scanner entreda;

    public static void main(String[] args) {

        entreda = new Scanner(System.in);
        int numRepeticiones = entreda.nextInt();

        while (numRepeticiones > 0) {
            int numAnios = entreda.nextInt();
            numAnios = numAnios - 2015;
            if (numAnios >= 0) {
                System.out.println((numAnios + 1) + " A.C");
            } else {
                System.out.println((numAnios * (-1)) + " D.C");
            }
            numRepeticiones--;
        }

    }

}
