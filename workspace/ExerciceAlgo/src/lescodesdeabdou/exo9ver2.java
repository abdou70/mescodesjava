import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir l'heure de votre depart");
		Scanner heure1 = new Scanner (System.in);
		
		int hd = heure1.nextInt();
		
		System.out.println("Veuillez saisir les minutes de depart");
		Scanner minute1 = new Scanner (System.in);
		
		int md = minute1.nextInt();
		
		System.out.println("veuillez saisir l'heure d'arriver");
		Scanner heure2 = new Scanner (System.in);
		int ha = heure2.nextInt();
		
		System.out.println("Veuillez saisir les minutes d'arriver");
		Scanner minute2 = new Scanner (System.in);
		
		int ma = minute2.nextInt();
		
		 if (hd < ha && md > ma) {
			 System.out.println("Votre voyage a duré " + ha-1-hd + " heures et " + ma+60-md + " minutes"); 
		 }
		 
		 if (hd < ha && md < ma ) {
			 System.out.println("Votre voyage a duré " + ha - ha + "heures et " + ma-md + " minutes");
		 }
         if (ha < hd &&  ma > md ) {
        	 System.out.println("votre voyage a duré " + 24-hd+ha + " heures et " ma -md + " minutes "); 
         }
         if (ha < hd && ma < md ) {
        	 System.out.println("votre voyage a duré " + 23+ha-hd + "heures et " 60-md+ma + "minutes");
         }
	}

}
