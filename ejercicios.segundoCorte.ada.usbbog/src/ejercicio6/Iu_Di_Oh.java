/*
Primero se ingresa el número de atributos 

Luego la cantidad de cartas que tiene marcos y leonardo respectivamente 

Luego se ingresan las cartas de cada uno y se escriben el valor de los 3 
atributos de las cartas de marcos 

Luego se ingresan las cartas de cada uno y se escriben el valor de los 3 
atributos de las cartas de leonardo 

Se ingresan el numero de la carta que elige cada uno 

Es número del atributo 

 */
package ejercicio6;

import java.util.Scanner;

public class Iu_Di_Oh {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//         TODO code application logic here

//        Ingresa el numero de atributos de las cartas 
        int atributos = input.nextInt();
        int cartasMarco = input.nextInt();
        int cartasLeo = input.nextInt();

        int marcos[][] = new int[cartasMarco][atributos];
        int leo[][] = new int[cartasLeo][atributos];

        for (int i = 0; i < cartasMarco; i++) {
            for (int j = 0; j < atributos; j++) {
                marcos[i][j] = input.nextInt();
            }
//            System.out.println("");
        }

//        System.out.println("");

//        for (int i = 0; i < cartasMarco; i++) {
//            for (int j = 0; j < atributos; j++) {
//                System.out.print(marcos[i][j]+" ");
//            }
//            System.out.println("");
//        }

        for (int i = 0; i < cartasLeo; i++) {
            for (int j = 0; j < atributos; j++) {
                leo[i][j] = input.nextInt();
            }
//            System.out.println("");
        }

//        System.out.println("");
//
//        for (int i = 0; i < cartasLeo; i++) {
//            for (int j = 0; j < atributos; j++) {
//                System.out.print(leo[i][j]+" ");
//            }
//            System.out.println("");
//        }

        int cartElegida1 = input.nextInt(); // carta elegida por marcos
        int cartElegida2 = input.nextInt(); // carta elegida por leonardo

        int arrayMarcos[] = new int[atributos];
        int arrayLeo[] = new int[atributos];

        for (int i = 0; i < arrayMarcos.length; i++) {
            arrayMarcos[i] = marcos[cartElegida1 - 1][i];
            arrayLeo[i] = leo[cartElegida2 - 1][i];

        }
//
//        System.out.println("");
//        for (int j : arrayMarcos) {
//            System.out.print(j + " ");
//        }
//
//        System.out.println("");
//        for (int i : arrayLeo) {
//            System.out.print(i + " ");
//        }

        int atributoElegido = input.nextInt();

//        System.out.println("");
//        System.out.println(arrayMarcos[atributoElegido - 1]);
//        System.out.println(arrayLeo[atributoElegido - 1]);

        if (arrayMarcos[atributoElegido - 1] > arrayLeo[atributoElegido - 1]) {
            System.out.println("Marco");
        } else if (arrayMarcos[atributoElegido - 1] < arrayLeo[atributoElegido - 1]) {
            System.out.println("Leonardo");
        } else {
            System.out.println("Empate");
        }
    }
}
