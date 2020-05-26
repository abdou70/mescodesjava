package lescodesdeabdou ;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		System.out.println("veuiller le rayon de votre cercle : ");
		Scanner rayon = new Scanner (System.in);
		 int r = rayon.nextInt();
		 int surf = r*r ;
		 double peri = 2 * r * Math.PI;		
		System.out.println("la surface du cercle est :" + surf +" et son perimetre est :" + peri);
				

	}

}
