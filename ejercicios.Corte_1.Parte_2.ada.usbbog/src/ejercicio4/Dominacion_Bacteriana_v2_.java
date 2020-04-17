package ejercicio4;

import java.util.Scanner;

public class Dominacion_Bacteriana_v2_ {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        int cantBacterias = input.nextInt();

        int area = input.nextInt();

        int matriz[][] = new int[area][area];

        for (int i = 0; i < area; i++) {
            for (int j = 0; j < area; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

//        for (int i = 0; i < area; i++) {
//            for (int j = 0; j < area; j++) {
//                System.out.print(matriz[i][j]+"  ");
//            }
//            System.out.println("");
//        }
        
        int suma=0;
        
        for (int i = 0; i < area; i++) {
            for (int j = 0; j < area; j++) {
                
                if(matriz[i][j] == 1){
                    suma=suma+1;
                }
            }
        }
        
        System.out.println(suma);
        
    }
    
    static int sumarCeros(int matriz[][]){
        
        int suma=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j] == 1 && j < matriz.length) {
                    if (matriz[i][j] == 0) {
                        
                    }
                    
                }
            }
        }
        
        return suma;
    }
    
    static boolean verificarCeros(int matriz[][], int pos1,int pos2){
        
        for (int i = pos1; i < matriz.length; i++) {
            for (int j = pos2; j < matriz.length; j++) {
                
            }
        }
        
        
        return false;
    }

}
