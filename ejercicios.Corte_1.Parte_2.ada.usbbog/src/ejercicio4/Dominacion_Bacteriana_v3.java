package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dominacion_Bacteriana_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner e = new Scanner(System.in);
        /*Se almacena el numero de casos de areas*/
        int bacteriasExpuestas = e.nextInt();
        
        /*en este ciclo se piden las dimensiones de la matriz */
        for (int i = 0; i < bacteriasExpuestas; i++) {
            int area = e.nextInt();
            int[][] matriz = new int[area][area];

            //Realizar cuadricula agregar los elementos en cada posicion i j, rellenar la matriz
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    matriz[j][k] = e.nextInt(); // se leen los numeros en la matriz en la posicion j k, y se llena la matriz
                }
            }
            

            /*
                ciclo para sumar los unos que hay en la matriz de la bactaeria
                 cuenta cuantos unos hay en la matriz
             */
            int contador1 = 0;
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[j][k] == 1) {
                        contador1 += 1;
                    }
                }
            }

            // resultado suma de los unos en la matriz
//            System.out.println(contador1);

            /**
             * ciclo o proceso para contar los ceros que estan encerrados en los unos 
             */
            
            int contador2 = 0; // contador2 que almacena los ceros que cumplen con las condiciones
            for (int j = 0; j < matriz.length; j++) { //recorre las filas 
               
                for (int k = 0; k < matriz.length; k++) { //recorre las columnasj

                    if (matriz[j][k] == 1) { //Proceso de si hay un 1  y mire el de al lado derecho, si es un cero.

                    	/*si el valor de la siguiente posicion es menor al tamaño de la matriz haga lo que esta adentro, 
                    	 * este if es para que no se desborde la matriz, el ciclo no llega la ultima posicion*/
                        if (k + 1 < matriz.length) {

                        	/*se mantiene la fila y se valida si la siguiente columna tiene un cero y ya se ha validado si antes habia un 1
                        	 */
                            if (matriz[j][k + 1] == 0) {  

                            	// validar si el cero en cuestion cumple la condicion de estar rodeado de unos
                                if (validarCeros(matriz, j, k + 1)) { // si retorna verdadero entre al if 

                                    k = k + 1; // se aumenta una posicion de las columnas

                                    if (k < matriz.length) {
                                    	
                                    	// dependiendo del resultado del metodo sumarCeros(si da uno o cero) el contador2 aumenta uno o cero
                                        contador2 = contador2 + sumarCeros(matriz, j, k);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            /*
            Resultado de la suma de los ceros
             */
//            System.out.println(contador2);
            System.out.printf("%n%.2f", diviision(contador1, contador2));
        }
        System.out.println("\n");
    }

    static double diviision(int sumaUnos, int sumaCeros) {

        return (double) (sumaUnos + sumaCeros) / 2;
    }


    /**
     * 
     * @param matriz
     * @param posicion1
     * @param posicion2
     * @return
     * 
     * Método para sumar los ceros
     */
    static int sumarCeros(int matriz[][], int posicion1, int posicion2) {
        int contador = 0;
        for (int i = posicion2; i < matriz.length; i++) { // se inicia en la columna que se queda, recorre la posicion de la columna hacia la derecha

            if (matriz[posicion1][i] == 0) {// se valida si en la siguiente columna hay un cero

                if (validarCeros(matriz, posicion1, i)) {// validar si ese cero esta rodeado de unos llamando al metodo validarCeros

                    contador += 1;//si cumple la condicion el contador aumneta en uno
                } else {

                    contador = 0; // en caso de que no se cumpla la conidcion el contador es igual a cero 
                    i = matriz.length; // para salir del bucle i se iguala al tamaño de la matriz
                }
            } else {

                i = matriz.length; // para salir del bucle i se iguala al tamaño de la matriz
            }
        }
        return contador; // el resultado de contador
    }

    
    /**
     * 
     * @param matriz
     * @param posicion1 representacion de la fila donde se queda 
     * @param posicion2 representacion de la columna donde se queda
     * @return
     * 
     *     Metodo para verificar que los ceros tengan unos alrrededor
     */
    
    static boolean validarCeros(int matriz[][], int posicion1, int posicion2) {
        boolean verificador = false;
        
        for (int i = posicion2; i < matriz.length; i++) { // ciclo para recorrer la columna

            if (matriz[posicion1][i] == 1) { // se valida si en la siguiente columna hacia la derecha tiene un uno 

                i = matriz.length; // esto es para salir del for porque la i se iguala al tamaño de la matriz

                //Proceso para evaluar si arriba del 0 hay un 1, si j es -1 sale del bucle.
                for (int j = posicion1 - 1; j >= 0; j--) { // para una posicion arriba de la fila(j) es mayor o igual a cero, recorre al reves

                    if (matriz[j][posicion2] == 1) { // se valida si en las posiciones hacia arriba hay un uno 

                        j = -1; // se sale del ciclo forzamente 

                        for (int k = posicion1 + 1; k < matriz.length; k++) {// recorrer las posciones de las filas hacias abajo 

                            if (matriz[k][posicion2] == 1) { // se valida si en las posiciones hacia abajo hay un uno 

                                k = matriz.length + 1; // se sale del ciclo por que la k es mayor al tamaño de la matriz

                                verificador = true; // eso quiere decir que el cero si cumple con todas las conndiciones
                            }
                        }
                    }
                }
            }
        }
        return verificador; // retorna falso o verdadero
    }

}
