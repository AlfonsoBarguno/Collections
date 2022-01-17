package s3N1ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {

		Generadora film = new Generadora(); 
		
		//ArrayList
		
		ArrayList<String> listaArrayList = new ArrayList<String>();
		
		for (int i=0; i<20;i++) {
			listaArrayList.add(film.next());
		}
		System.out.println("Esto es un ArrayList: " + listaArrayList);
		
		//LinkedList
		
		LinkedList<String> listaLinked = new LinkedList<String>();
		
		for (int i = 0; i<20; i++) {
			listaLinked.add(film.next());}
		
		System.out.println("Esto es un LinkedList: " + listaLinked);
		
		//HashSet
	
		HashSet<String> listaHash = new HashSet<String>();
		
		for(int i = 0; i <20; i++) {
			listaHash.add(film.next());
		}
		System.out.println("Esto es un Hashset: " +listaHash);
		
		//LinkedHashSet
		
		LinkedHashSet<String> listaLinkedHash = new LinkedHashSet<String>();
		
		for(int i = 0; i < 20; i++) {
			listaLinkedHash.add(film.next());
		}
		System.out.println("Esto es un LinkedHashSet: " + listaLinkedHash);
		
		//TreeSet
		
		TreeSet<String> listaTree = new TreeSet<String>();
		
		for(int i= 0; i < 20; i++) {
			listaTree.add(film.next());
		}
		System.out.println("Esto es un TreeSet: " + listaTree);
		
		
		
	}}


