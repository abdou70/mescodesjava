package lescodesdeabdou;

import java.util.Scanner;

public class main9 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir l'abscisse du point A");
		
		Scanner abscise = new Scanner (System.in);
		
		double x1 = abscise.nextDouble();
		
		System.out.println("Veuillez saisir l'ordonner du point A");
		
		Scanner ordon = new Scanner (System.in);
		
		double  y1 = ordon.nextDouble();
		
		System.out.println("Veuillez saisir l'abscisse du point B");
		
		Scanner abscis1 = new Scanner (System.in);
		
		   double x2 = abscis1.nextDouble();
		System.out.println("Veuillez saisit l'ordonner du point B");
		
		Scanner ordon1 = new Scanner (System.in);
		
		double y2 = ordon1.nextDouble();
		
		double x = (x1 -x2)*(x1-x2);
		double y = (y1-y2)*(y1-y2);
		
		double distance = Math.sqrt (x + y);
		

		System.out.println("la distance entre les deux points est égal à : " + distance);
		

		
	}

}
