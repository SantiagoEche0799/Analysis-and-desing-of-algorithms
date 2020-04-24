package parte_3_algortimos_recursivos_ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Palabras_Repetidas_enUn_Poema {

    public static ArrayList<String> array1 = new ArrayList<String>();
    public static ArrayList<String> array2 = new ArrayList<String>();
    static String cadenaDeTexto;

    public static void main(String[] args) {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String linea;
        String poema = "";
        try {

            archivo = new File("poema.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            while ((linea = br.readLine()) != null) {
                poema += linea + "\n";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }

        System.out.println("Cantidad de vocales: " + conteoVocales(poema, 0));
        System.out.println("Cantidad de espacios: " + conteoEspacios(poema));
        System.out.println("Cantidad de consonantes: " + contepConsonantes(poema, 0));
        System.out.println("Cantidad de letras: " + conteoLetras(conteoVocales(poema, 0), contepConsonantes(poema, 0)));
        palabrasRepetidas(array1, poema, 0, "");
        arregloOrdenado(array1, 0, 1);
        palabrasRepetidas(array2, poema, 0, "");
        System.out.println("");
        conteoPalabras(array1, array2, 0, 0, 0);
    }

    //Metodo para contar la vocal 
    public static int conteoVocales(String texto, int pos) {
        if (pos < texto.length()) {
            char letra = texto.toLowerCase().charAt(pos);
            if (validar_si_es_Vocal(letra)) {
                return 1 + conteoVocales(texto, pos + 1);
            } else {
                return conteoVocales(texto, pos + 1);
            }
        } else {
            return 0;
        }
    }

    //Validar si es una vocal
    public static boolean validar_si_es_Vocal(char vocal) {
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';
    }

    //Contar Espacios
    public static int conteoEspacios(String espacios) {
        if (espacios.length() == 0) {
            return 0;
        } else {
            if (espacios.charAt(0) == ' ') {
                return 1 + conteoEspacios(espacios.substring(1));
            } else {
                return 0 + conteoEspacios(espacios.substring(1));
            }
        }
    }

    //Validar si es una constante consonantes
    public static boolean validarConstannte(char letra) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
    }

    //Contar Constantes 
    public static int contepConsonantes(String palabra, int pos) {
        if (pos < palabra.length()) {
            char caracter = palabra.charAt(pos);
            if (validarConstannte(caracter)) {
                return 1 + contepConsonantes(palabra, pos + 1);
            } else {
                return contepConsonantes(palabra, pos + 1);
            }
        } else {
            return 0;
        }
    }

    //Contar letras
    public static int conteoLetras(int vocales, int consonantes) {
        if (consonantes == 0) {
            return vocales;
        } else if (vocales == 0) {
            return consonantes;
        } else {
            return 1 + conteoLetras(vocales, consonantes - 1);
        }
    }

    /*
        Estudiar y revisar este metodo
     */
    //Contar Palabras
    public static ArrayList<String> palabrasRepetidas(ArrayList<String> palabras, 
            String palabra, int index, String cadena_nueva) {

        if (index != palabra.length()) {
            if (palabra.charAt(index) != ' ' && palabra.charAt(index) != '\n') {
                cadena_nueva += palabra.charAt(index);
            } else {
                if (!cadena_nueva.equals("")) {
                    palabras.add(cadena_nueva);
                    cadena_nueva = "";
                }
            }
            palabrasRepetidas(palabras, palabra, index + 1, cadena_nueva);
        }

        return palabras;
    }

    /*
        Estudiar y revisar este metodo
     */
    
    public static ArrayList<String> arregloOrdenado(ArrayList<String> arrayPalabras, int i, int j) {
        if (i < arrayPalabras.size() - 1) {
            if (j < arrayPalabras.size()) {
                if (arrayPalabras.get(i).equalsIgnoreCase(arrayPalabras.get(j)) 
                        || arrayPalabras.get(j).equals("")) {
                    
                    arrayPalabras.remove(j);
                    j = i + 1;
                    arregloOrdenado(arrayPalabras, i, j);
                }
                j = j + 1;
                arregloOrdenado(arrayPalabras, i, j);
            } else {
                i = i + 1;
                j = i + 1;
                arregloOrdenado(arrayPalabras, i, j);
            }
        }
        return arrayPalabras;
    }
    
    
    /*
        Estudiar y repasa este metodo
    */

    /*
        index = recorre recorre el arreglo sin las palbras repetidas
        index2 = recorre el arreglo con las palabras repetidas
     */
    public static String conteoPalabras(ArrayList<String> arrayPalabrasRepetidas,
            ArrayList<String> arrayPalbrasSinRepetir, int contador, int index, int index2) {

        if (index < arrayPalabrasRepetidas.size()) {
            if (index2 < arrayPalbrasSinRepetir.size()) {
                if (arrayPalabrasRepetidas.get(index).equalsIgnoreCase(arrayPalbrasSinRepetir.get(index2))) {
                    contador = contador + 1;
                }
                index2 = index2 + 1;
                conteoPalabras(arrayPalabrasRepetidas, arrayPalbrasSinRepetir, contador, index, index2);
            } else {
                cadenaDeTexto = "La palabra " + arrayPalabrasRepetidas.get(index) + " esta repetida " + String.valueOf(contador) + " veces";
                System.out.println(cadenaDeTexto);
                index2 = 0;
                contador = 0;
                index = index + 1;
                conteoPalabras(arrayPalabrasRepetidas, arrayPalbrasSinRepetir, contador, index, index2);
            }
        }
        return cadenaDeTexto;
    }
}
