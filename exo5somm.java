package lescodesdeabdou;

import java.util.Scanner ;

public class main6 {
	
	public static void main(string[] arg) { 
		int i = 0;
		int som = 0 ;
		   while (i <= 5) {
			
		         System.out.println("Veuillez saisir un entier n");
		    
		         Scanner nombre = new Scanner (System.in);
		    
		           int  total = nombre.nextInt();
		    
		           som = som + total ;
		    		
		              i= i ++;
		   } 
		
		 System.out.println("la somme des nomres saisi est :" + som);
		     
	}

}
