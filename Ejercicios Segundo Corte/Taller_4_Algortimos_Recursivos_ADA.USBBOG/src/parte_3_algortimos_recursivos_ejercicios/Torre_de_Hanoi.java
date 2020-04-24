package parte_3_algortimos_recursivos_ejercicios;

public class Torre_de_Hanoi {

    static int conteo = 0;

    public static void main(String[] args) {
        torresHanoi(4, 'A', 'B', 'C');
        System.out.println("Juego Completado\n"
                + "Cantidad de movimientos: " + conteo);

    }

    public static void torresHanoi(int discos, char origen, char auxiliar, char destino) {
        //Caso base

        if (discos == 1) {
            System.out.println("Mover disco " + discos + " de Torre " + origen + " a Torre " + destino);
        } else {
            //Recursividad o Dominio
            torresHanoi(discos - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + discos + " de Torre " + origen + " a Torre " + destino);
            torresHanoi(discos - 1, auxiliar, origen, destino);
        }
        conteo++;
    }

}
