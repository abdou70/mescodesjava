/*Exercice 3 :
Version 1 :
Faire un programme qui saisit 3 r�sistances : R1, R2 et R3.
Calculer et afficher la r�sistance en s�rie : R1 + R2 +R3
Calculer et afficher la r�sistance en parall�le : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)*/


package lescodesdeabdou;

import java.util.Scanner;
public class main3 {
	
	public static void main(String[] args) {
		
		System.out.println("veuiller la resistance R1 du circuit: ");
		Scanner resistance1 = new Scanner (System.in);
		 int R1 = resistance1.nextInt();
		 
		 System.out.println("veuiller la resistance R2 du circuit: ");
			Scanner resistance2 = new Scanner (System.in);
			 int R2 = resistance2.nextInt();
			 
			 System.out.println("veuiller la resistance R1 du circuit: ");
				Scanner resistance3 = new Scanner (System.in);
				 int R3 = resistance3.nextInt();
				 
				 int rest1 = R1 + R2 + R3 ;
				 int rest2 = (R1 * R2 * R3) / (R1*R2 + R1*R3 + R2*R3 );
				 
		System.out.println("la resistance en serie est :" + rest1 + " et la resistance en derivation est :" + rest2);
				

	}

}
