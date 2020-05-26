import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir l'heure de votre depart");
		Scanner heure1 = new Sacnner (System.in);
		
		int hd = heure1.nextInt();
		System.out.println("veuillez saisir les minutes de depart");
		Scanner minute1 = new Scanner (System.in);
		
		int md = minute1 = new Scanner (System.in);
		
		System.out.println("Veuillez saisir votre heure d'arriver");
		Scanner heure2 = new Scanner (System.in);
		
		int ha = heure2.nextInt();
		
		System.out.println("Veuillez saisir les minutes d'arriver");
		Scanner minute2 = new Scanner (System.in);
		
		int ma = minute2.nextInt();
		 if (ma > md) {
			 System.out.println("votre voyage à duré " + ha - hd + " heures " + ma-md + " minutes ");
		 }
		 if (ma < md) {
			 System.out.println("Votre voyage à duréé " + ha-1-hd + " heures " + ma+60-md + " minutes ");
			 
		 }
		

	}

}
