package s3N1ex6;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListInMiddle {

	// static Random ran=new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un objecte buit LinkedList<Integer>. Utilitzant un iterador
		 * ListIterator, afegeixi valors sencers a la llista inserint-los sempre a la
		 * meitat d'aquesta.
		 */

		
		//Creo la LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();

		//añado valores según la función getIterator
		getIterator(list).add(1);
		getIterator(list).add(2);
		getIterator(list).add(3);
		getIterator(list).add(4);
		getIterator(list).add(5);
		getIterator(list).add(6);

		System.out.println(list);
	}

	//La función getIterator, que recibe una lista, la parte en dos
	private static ListIterator<Integer> getIterator(LinkedList<Integer> list) {
		return list.listIterator(list.size() / 2);
	}

}
