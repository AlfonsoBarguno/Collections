package s3N1ex2;

import java.util.*;

import s3N1ex1.month;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		month m1 = new month("Enero");
		month m2 = new month("Febrero");
		month m3 = new month("Marzo");
		month m4 = new month("Abril");
		month m5 = new month("Mayo");
		month m6 = new month("Junio");
		month m7 = new month("Julio");
		month m9 = new month("Septiembre");
		month m10 = new month("Octubre");
		month m11 = new month("Noviembre");
		month m12 = new month("Diciembre");
		
		Set<month> meses= new HashSet<month>();
		
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		meses.add(m5);
		meses.add(m6);
		meses.add(m7);
		meses.add(m9);
		meses.add(m10);
		meses.add(m11);
		meses.add(m12);
		
		
		
		/*for(int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]);*/
			
		for(month m : meses) {
			System.out.println(m);
		}
		
		
		System.out.println("");
		
		meses.add(m11);
		
		
		for(month m : meses) {
			System.out.println(m);
		}
		}
	}


