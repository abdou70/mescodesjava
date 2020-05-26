package lescodesdeabdou;

import java.util.Scanner;

public class main8 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir un reel x");
		
		Scanner num  = new Scanner (System.in);
		
		double y = num.nextDouble();
		
		System.out.println("Veuilles saisir un entier n");
		
		Scanner mon = new Scanner (System.in);
		
		int n = mon.nextInt();
		
		double puissance = Math.pow (y,n);
		
		System.out.println(y + " à la puissance " + n + " est :" + puissance);
		
		
		
		
		
		
		
	}

}
