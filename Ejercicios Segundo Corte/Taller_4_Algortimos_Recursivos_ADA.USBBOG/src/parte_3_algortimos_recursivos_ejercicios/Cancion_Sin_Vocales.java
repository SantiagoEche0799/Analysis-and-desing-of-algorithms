package parte_3_algortimos_recursivos_ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cancion_Sin_Vocales {

    static FileWriter fichero = null;
    static PrintWriter pw = null;

    public static void main(String[] args) {
        eliminarVocales("archivo.txt");
    }

    public static void escribirArchivo(String sinVocales) {

        try {
            fichero = new FileWriter("D:\\cancionSinVacales.txt");

            fichero.write(sinVocales);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    static void eliminarVocales(String ruta) {
        try (Scanner file = new Scanner(new File(ruta))) {
            String sin_vocales_txt = "";
            while (file.hasNextLine()) {
                String cadena_linea = file.nextLine();

                System.out.println(cadena_linea);
                sin_vocales_txt += sinVovales(cadena_linea, "aeiou", 0);
            }

            escribirArchivo(sin_vocales_txt);
        } catch (FileNotFoundException ex) {
            System.out.println("No fue posible leer el archivo, intentelo de nuevo por favor.");
        }
    }

    static String sinVovales(String texto, String vocales, int indice) {
        if (indice == texto.length()) {
            return "\n";
        } else {
            if (!vocales.contains(String.valueOf(texto.charAt(indice)))) {
                return texto.charAt(indice) + sinVovales(texto, vocales, indice + 1);
            } else {
                return sinVovales(texto, vocales, indice + 1);
            }
        }
    }
}
