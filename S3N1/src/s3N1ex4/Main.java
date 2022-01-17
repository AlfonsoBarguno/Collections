package s3N1ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet; 

public class Main {
	
	//creo la función que itera la colección y llama 
	//al método toString

public static <T> void iterCollection(Collection<T> c) {
		
		Iterator<T> it=c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
			
		}	
	}
	
	
	public static void main(String[]args) {
		
		
		
		//ArrayList
		
		ArrayList<Derivada> datosArray = new ArrayList<Derivada>();	
		
		datosArray.add(new Derivada ("Dani"));
		datosArray.add(new Derivada ("David"));
		datosArray.add(new Derivada ("Darío"));
		

						
		//LinkedList
		
		LinkedList<Derivada> datosLinkedList = new LinkedList<Derivada>();

		datosLinkedList.add(new Derivada ("Roberto"));
		datosLinkedList.add(new Derivada ("Raul"));
		datosLinkedList.add(new Derivada ("Rodrigo"));
        
        
        //HashSet
        
		HashSet<Derivada> datosHashSet = new HashSet<Derivada>();
		
		datosHashSet.add(new Derivada ("Juan"));
		datosHashSet.add(new Derivada ("Jeremías"));
		datosHashSet.add(new Derivada ("Juana"));
        
		
			
		//LinkedHashSet
			
		LinkedHashSet<Derivada> datosLinkedHashSet = new LinkedHashSet<Derivada>();
		
		datosLinkedHashSet.add(new Derivada ("Mario"));
		datosLinkedHashSet.add(new Derivada ("Marta"));
		datosLinkedHashSet.add(new Derivada ("María"));
				
		
		//TreeSet
		
		TreeSet<Derivada> datosTreeSet = new TreeSet<Derivada>();
			
		datosTreeSet.add(new Derivada ("Pedro"));
		datosTreeSet.add(new Derivada ("Pablo"));
		datosTreeSet.add(new Derivada ("Paula"));
		
		
		// llamo a la función
		
		System.out.println("ArrayList:");
		
		iterCollection(datosArray);
		
		System.out.println("LinkedList:");
		
		iterCollection(datosLinkedList);
		
		System.out.println("HashSet:");
		
		iterCollection(datosHashSet);
		
		System.out.println("LinkedHashSet:");
		
		iterCollection(datosLinkedHashSet);
		
		
		System.out.println("TreeSet:");
		iterCollection(datosTreeSet);
		
		
	
	}
	
	
	
		
		
	
	}
	
	
	
