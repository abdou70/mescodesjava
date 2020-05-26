package lescodesdeabdou;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir le montant en euro ");
		
		Scanner saisir = new Scanner (System.in);
		
		int billet = saisir.nextInt();
		
	      int billet20 = billet / 20 ;
           
	      int rest = billet % 20;
	      
	      int billet10 = rest / 10;
	      
	      int rest1 = rest % 10 ;
	      
	      int billet5 = rest1 / 5 ;
	      
	      int rest2 = rest1 % 5 ;
	      
	      int piece2 = rest2 / 2 ;
	      
	      System.out.println("Votre billet est composée de : " + billet20 + "de billet de 20 euros , " + billet10 + " de billet de 10 euros , " + billet5 + " de billet de 5 euros ," + piece2 + " de piece de 2 euro et le reste c'est des pieces d'un euro .");
	      

	}

}
