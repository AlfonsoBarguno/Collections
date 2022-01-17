package s3N1ex3;

import java.util.*;


import java.util.ListIterator;

/*Exercici 3. Crea una classe anomenada 
 * Generadora que retorni noms de personatges 
 * (com String) de la seva pel·lícula 
 * favorita cada que vegada que invoqui 
 * al mètode 'seguentPersonatge()', 
 * i que torni al principi de la llista de 
 * personatges una vegada que hagi acabat 
 * amb tots els noms. Utilitzi aquest 
 * generador per a emplenar un ArrayList, 
 * un LinkedList, un HashSet, un LinkedHashSet 
 * i un TreeSet, i després imprimeixi per pantalla cada contenidor. 
 * */

public class Generadora {
	
	private String personatge[] = new String[10];
	private static int index  = 0;
	
	public Generadora() {
		personatge[0] = "Harry";
		personatge[1] = "Joan";
		personatge[2] = "Angela";
		personatge[3] = "Sara";
		personatge[4] = "Berta";
		personatge[5] = "Wendy";
		personatge[6] = "Yusuf";
		personatge[7] = "Edy";
		personatge[8] = "Sabana";
		personatge[9] = "Guleria";
	}
	
	  

	public String next() {
	        int temp=index;
	        index = index+1;
	        index = index % personatge.length;
	        return personatge[temp];
	    }
	
	}


