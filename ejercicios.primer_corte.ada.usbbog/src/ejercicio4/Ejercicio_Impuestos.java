package ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_Impuestos {

	private static Scanner input;

	public static void main(String[] args) throws IOException {

		float n, resultado, f1, f2, f3;
		input = new Scanner(System.in);
		n = input.nextFloat();

		if (n <= 2000) {

			System.out.print("Isento\n");

		} else {

			if (n > 2000 && n <= 3000) {
				f1 = n - 2000;
				f1 = ((f1 * 8) / 100);
				resultado = f1;

			} else if (n > 3000 && n <= 4500) {

				f1 = n - 2000;
				f2 = f1 - 1000;
				f1 -= f2; // f1 = f1 - f2
				f1 = ((f1 * 8) / 100);
				f2 = ((f2 * 18) / 100);
				resultado = f2 + f1;

			} else {

				f1 = n - 2000;
				f2 = f1 - 1000;
				f3 = f2 - 1500;
				f1 -= f2;
				f2 -= f3;
				f1 = ((f1 * 8) / 100);
				f2 = ((f2 * 18) / 100);
				f3 = ((f3 * 28) / 100);
				resultado = f3 + f2 + f1;

			}
			System.out.printf("R$ %.2f\n", resultado);
		}

	}

}