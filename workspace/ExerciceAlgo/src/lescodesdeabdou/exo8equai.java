package lescodesdeabdou;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		System.out.println("veuiller saisir les coefficientde l'equation ax2 + bx +c");
		
		System.out.println("Veuillez saisir le coefficient de a de x2");
		
		Scanner nombre1 = new Scanner (System.in);
		
		double a = nombre1.nextDouble();
		
		System.out.println("Veuillez saisir le coefficient b de x");
		
		Scanner nombre2 = new Scanner (System.in);
		
		double b = nombre2.nextDouble();
		
		System.out.println("Veuillez saisir la constante c de l'equation ");
		
		Scanner nombre3 = new Scanner (System.in);
		
		double c = nombre3.nextDouble();
		
		double  delta = (b*b)- (4*a*c);
		
		   if (delta < 0) {
			 System.out.println("l'equation n'a pas de solution");
		 }
		   if (delta == 0) {
				
				System.out.println("l'equation admet une solution double : x0 = " + (-b/(2*a)));
		 }
		  if (delta >0) {
			  System.out.println("les solutions sont : x1 = " + (-b-(Math.sqrt(delta)))/(2*a) + "et x2 = " + (-b + (Math.sqrt(delta)))/(2*a));
			  
		  }
		

	}

}
