package lescodesdeabdou;
 
import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		
		System.out.println("Veuillez saisir la resistance r1 circuit ");
		
		Scanner resistance1 = new  Scanner (System.in);
		
		int r1=resistance1.nextInt();
		
		System.out.println("Veuillez saisir la resistance r2 du circuit");
		
		Scanner resistance2 = new Scanner (System.in);
		
		int r2 = resistance2.nextInt();
		
		System.out.println("Veuillez saisir la resistance r3 du circuit ");
		
		Scanner resistance3 = new Scanner (System.in);
		
		int r3 = resistance3.nextInt();
		
		int rest1 = r1 + r2 + r3 ;
		
		int rest2 = (r1 * r2 * r3 )/ (r1*r2 + r1*r3 + r2*r3);
		 
		 System.out.println("Veuillez indiquez votre choix");
		 
		 Scanner choix = new Scanner (System.in);
		 
		 int veut = choix.nextInt();
		 
		  if (veut == 1) {
			  
			  System.out.println("la resistance en serie est : " + rest1);
			  }
		  if (veut == 2) {
			  System.out.println("la resistance en derivation est :" + rest2);
			  
		  }
		
		
		
		
		
	}

}
