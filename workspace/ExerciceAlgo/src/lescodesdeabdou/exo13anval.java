import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir le jour de votre date");
		Scanner jour = new Scanner (System.in);
		int jj = jour.nextInt();
		
		System.out.println("Veuillez sasir le mois de votre date");
		Scanner mois = new Scanner (System.in);
		int mm = mois.nextInt();
		
		System.out.println("Veuillez saisir l'ann�e de votre date");
		Scanner ann�e = new Scanner (System.in);
		int aa = ann�e.nextInt();
		
		 if (jj > 31 && mm > 12 ) {
			 System.out.println("Cette date est invalide");
		 }
		 
		 if (jj <= 31 && mm <=12) {
			 System.out.println("Cette date est valide");
		
		 }
	
	}

}
