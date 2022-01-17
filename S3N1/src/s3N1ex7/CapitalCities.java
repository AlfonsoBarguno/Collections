package s3N1ex7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

public class CapitalCities {
	/*
	 * Emplena un HashMap amb parelles clau-valor. Ordeni les parelles segons el
	 * codi hash i imprimeixi el resultat (Idea: fer servir un TreeMap). Extregui
	 * les parelles ordenades i introdueixi-les en un mapa LinkedHashMap (Idea: fer
	 * servir el seu constructor). Demostri que es manté l'ordre d'inserció.
	 * Extregui només les claus ordenades i introdueixi-les primer en un HashSet i
	 * després en un LinkedHashSet. Es manté l'ordre?
	 */

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Londres", "Inglaterra");
		capitalCities.put("Berlín", "Alemania");
		capitalCities.put("Roma", "Italia");
		capitalCities.put("Madrid", "España");

		System.out.println(capitalCities);

		Map<String, String> newMap = new TreeMap();
		newMap.putAll(capitalCities);
		System.out.println(newMap);

		LinkedHashMap<String, String> newLinkedMap = new LinkedHashMap<String, String>();
		newLinkedMap.putAll(capitalCities);
		System.out.println(newLinkedMap); // doesn't keep order

		HashSet<String> newHashSet = new HashSet<String>();
		LinkedHashSet<String> newLinkedHashSet = new LinkedHashSet<String>();

		// Invoke keySet() on the HashMap object to get the keys as a set
		Set<String> keys = capitalCities.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

		keys.addAll(newHashSet);
		keys.addAll(newLinkedHashSet);

		System.out.println(newHashSet); //results don't print**
		System.out.println(newLinkedHashSet);

	}

	/*
	 * HashMap<Integer, String> ob=new HashMap<Integer, String>(); //addding keys
	 * and values ob.put(23, "Vedant"); ob.put(7, "Aryan"); ob.put(17, "Tarun");
	 * ob.put(9, "Farhan"); Iterator <Integer> it = ob.keySet().iterator();
	 * System.out.println("Before Sorting"); while(it.hasNext()) { int
	 * key=(int)it.next();
	 * System.out.println("Roll number:  "+key+"     name:   "+ob.get(key)); }
	 * System.out.println("\n"); Map<Integer, String> map=new HashMap<Integer,
	 * String>(); System.out.println("After Sorting"); //using the TreeMap
	 * constructor in order to sort the HashMap TreeMap<Integer,String> tm=new
	 * TreeMap<Integer,String> (ob); Iterator itr=tm.keySet().iterator();
	 * while(itr.hasNext()) { int key=(int)itr.next();
	 * System.out.println("Roll no:  "+key+"     name:   "+ob.get(key)); } }
	 */

	/*
	 * Map<String, Integer> map = new HashMap<String, Integer>(); map.put("A", 34);
	 * map.put("B", 25); map.put("C", 50); map.put("D", 50);
	 * 
	 * MyComparator comp = new MyComparator(map);
	 * 
	 * Map<String, Integer> newMap = new TreeMap(comp); newMap.putAll(map);
	 * System.out.println(newMap); } }
	 * 
	 * class MyComparator implements Comparator { Map map;
	 * 
	 * public MyComparator(Map map) { this.map = map; }
	 * 
	 * @Override public int compare(Object o1, Object o2) { return
	 * (o2.toString()).compareTo(o1.toString()); }
	 */

}
