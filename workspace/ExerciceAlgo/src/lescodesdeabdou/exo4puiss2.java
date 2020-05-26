package lescodesdeabdou;

import java.util.Scanner;

public class main7 {
	
	 public static void main(string[]  arg) {
		 
		 System.out.println("Veuillez saisir un reel x");
		 
		 Scanner nombre = new Scanner (System.in);
		 
		 double x = nombre.nextDouble();
		 
		 System.out.println("Veuillez saisir un entier n");
		 
		 Scanner nombre1 = new Scanner (System.in);
		 
		 int n = nombre1.nextInt();
		 
		 double puiss = 1 ;
		 
		int i = 1 ;
		
		   while (i <= n) {
		  
		     puiss = puiss * x;
		     i = i++;
		   }
		System.out.println(x + " à la puissance " + n + " est égale à " + puiss);
		
		 	 
	 }

}
