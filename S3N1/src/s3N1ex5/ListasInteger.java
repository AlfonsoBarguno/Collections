package s3N1ex5;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

public class ListasInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea i emplena un objecte List<Integer>. Crea i emplena un segon objecte
		 * List<Integer> de la mateixa grandària que el primer. Utilitza sengles
		 * objectes ListIterator per a llegir els elements de la primera llista i
		 * inserir-los en la segona en ordre invers (provi d'explorar diverses formes
		 * diferents de resoldre aquest problema).
		 */

		List<Integer> miLista = new ArrayList<Integer>(Arrays.asList(3, 1, 4));
		List<Integer> miLista2 = new ArrayList<Integer>(Arrays.asList(7, 9, 11));

		ListIterator<Integer> it = miLista.listIterator();
		ListIterator<Integer> it2 = miLista2.listIterator();
		
		Collections.reverse(miLista);
		


        // imprimir lista2 con lista en orden descendente
        while (it.hasNext()) {
        	it2.add(it.next());
        }
            System.out.println(miLista2);
		
		 
			
		

		}

	}

