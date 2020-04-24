
package ejercicios_uri_online_judge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Web_Browser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner input = new Scanner(System.in);
        try {
            /*
		el numero de cadenas que va ingresar el usuario
             */
            int num1 = input.nextInt();

            ArrayList<String> arrayWords1 = new ArrayList<>();
            ArrayList<String> arrayWords2 = new ArrayList<>();

            boolean comprobar = true;

            if (num1 >= 1 && num1 <= Math.pow(10, 4)) {


                // Se ingresan las cadenas que se van a comparar
                for (int i = 0; i < num1; i++) {
                    String cadena = input.next();
                    if (cadena.length() <= 100) {
                        arrayWords1.add(cadena);
                    } else {
                        comprobar = false;
                        break;
                    }
                }

                /*Cadenas que se van a buscar y comparar en las primeras cadenas ingresadas */
                int num2 = input.nextInt();
                
                if (num2 >= 1 && num2 <= 100) {
                    for (int i = 0; i < num2; i++) {
                        String cadena2 = input.next();
                        if (cadena2.length() <= 100) {
                            arrayWords2.add(cadena2);
                        } else {
                            comprobar = false;
                            break;
                        }
                    }
                }

                if (comprobar) {

                    for (int i = 0; i < arrayWords2.size(); i++) {
                        int contador = 0;
                        int contador2 = 0;
                        for (int j = 0; j < arrayWords1.size(); j++) {
                            /*
			    se compara si las segundas cadenas se encuentran en las primeras cadenas 
                             */
                            if (arrayWords1.get(j).contains(arrayWords2.get(i))) {
                                contador += 1;
                                if (contador2 < arrayWords1.get(j).length()) {
                                    contador2 = arrayWords1.get(j).length();
                                }
                            }
                        }
                        /*
                            se realiza la impresion correspondinete
                        */
                        if (contador != 0) {
                            System.out.println("");
                            System.out.println(contador + "  " + contador2);
                        } else {
                            System.out.println("");
                            System.out.println("-1");
                        }
                    }
                } else {
                    System.out.println("ERROR, valores ingresados no válidos");
                }

            } else {
                System.out.println("ERROR, valores ingresados no válidos");
            }
        } catch (Exception o) {
            System.out.println("ERROR, valores ingresados no válidos");
        }

    }

}
