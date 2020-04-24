/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_uri_online_judge;

import java.util.Scanner;

public class Star_Trek {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int n = entrada.nextInt();

		int[] estrellasAtacadas = new int[n];

		int[] cantidadOvejas = new int[n];

		long totalEstrellas = 0;
		long ovejasSobrantes = 0;

		for (int i = 0; i < n; i++) {
			cantidadOvejas[i] = entrada.nextInt();
			estrellasAtacadas[i] = 0;
		}

		int j = 0;

		while (true) {

			if (j == 0 && cantidadOvejas[j] % 2 == 0) {
				estrellasAtacadas[j] = 1;

				if (cantidadOvejas[j] > 0) {
					cantidadOvejas[j]--;
				}
				break;
			} else if (j == (n - 1) && cantidadOvejas[j] % 2 == 1) {
				estrellasAtacadas[j] = 1;

				if (cantidadOvejas[j] > 0) {
					cantidadOvejas[j]--;
				}
				break;
			} else if (cantidadOvejas[j] % 2 == 1) {

				if (cantidadOvejas[j] > 0) {
					cantidadOvejas[j]--;
					estrellasAtacadas[j] = 1;
					j++;
				}
			} else if (cantidadOvejas[j] % 2 == 0) {
				estrellasAtacadas[j] = 1;

				if (cantidadOvejas[j] > 0) {
					cantidadOvejas[j]--;
					j--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			ovejasSobrantes += cantidadOvejas[i];
			totalEstrellas += estrellasAtacadas[i];
		}

		System.out.println(totalEstrellas + " " + ovejasSobrantes);

	}

}

