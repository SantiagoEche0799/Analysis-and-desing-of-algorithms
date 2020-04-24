package ejemplos_java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<Integer>();
		conjunto1.add(20);
		conjunto1.add(10);
		conjunto1.add(1);
		conjunto1.add(5);
		conjunto1.add(40);
		conjunto1.add(-3);
		conjunto1.add(-10);
		conjunto1.add(200);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		conjunto1.add(20);
		// La impresión no asegura un orden específico
		for (int elemento : conjunto1)
			System.out.print("	"+elemento + "	");
		System.out.println();

		Set<Integer> conjunto2 = new TreeSet<Integer>();
		conjunto2.add(20);
		conjunto2.add(10);
		conjunto2.add(1);
		conjunto2.add(5);
		conjunto2.add(100);
		conjunto2.add(40);
		conjunto2.add(-2000);
		conjunto2.add(-98);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		conjunto2.add(20);
		// Los elementos se muestran de menor a mayor
		for (int elemento : conjunto2)
			System.out.print("	"+elemento + "	");
		System.out.println();

		Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
		conjunto3.add(20);
		conjunto3.add(10);
		conjunto3.add(1);
		conjunto3.add(5);
		conjunto3.add(30);
		conjunto3.add(43);
		conjunto3.add(-21);
		conjunto3.add(99);
		// El valor 20 no se inserta en el conjunto ya que se encuentra repetido
		conjunto3.add(20);
		// Los elementos se muestran en el orden que se insertaron
		for (int elemento : conjunto3)
			System.out.print("	"+elemento + "	");
		System.out.println();

	}
}
