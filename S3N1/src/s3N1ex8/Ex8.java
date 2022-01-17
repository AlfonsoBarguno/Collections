package s3N1ex8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Emplena un mapa LinkedHashMap amb claus de tipus String i objectes del tipus
		 * que prefereixi. Extregui les parelles, ordeni-les segons les claus (en ordre
		 * alfabètic) i torni a inserir-les en el mapa. Idea: Fes servir un ArrayList
		 * per realitzar l'ordenació amb la classe Comparator.
		 */

		//creo el LinkedHashMap
		LinkedHashMap<String, Integer> newLinkedMap = new LinkedHashMap<String, Integer>();

		newLinkedMap.put("Robert", 1);
		newLinkedMap.put("Joan", 2);
		newLinkedMap.put("María", 3);
		newLinkedMap.put("Alba", 4);
		newLinkedMap.put("Romina", 5);

		System.out.println(newLinkedMap);

		//lo convierto en un TreeMap
		Map<String, Integer> map = new TreeMap<>(newLinkedMap);

		//Imprimo las claves ordenadas y los valores
		for (String sKey : map.keySet()) {
			System.out.println("Clave -> " + sKey + ":  Valor -> " + newLinkedMap.get(sKey));

		}

	}
}
