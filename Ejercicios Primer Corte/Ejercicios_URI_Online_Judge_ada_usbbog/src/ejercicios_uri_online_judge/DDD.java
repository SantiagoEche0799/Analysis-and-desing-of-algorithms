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
public class DDD {

    private static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        int ddd = entrada.nextInt();

        switch (ddd) {

            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Victoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;

            default:
                System.out.println("DDD no encontrado");
                break;

        }
    }

}
