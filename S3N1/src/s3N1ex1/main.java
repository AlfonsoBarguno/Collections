package s3N1ex1;
import java.util.ArrayList;

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
		
		ArrayList<month> meses= new ArrayList<month>();
		
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
		
		
		
		
			
		for(month m : meses) {
			System.out.println(m);
		}
		
		month m8 = new month("Agosto");
		meses.add(7,m8);
		
		
		for(month m : meses) {
			System.out.println(m);
		}
		}
	}


