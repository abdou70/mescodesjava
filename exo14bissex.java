import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		System.out.println("veuillez saisir le jour");
		Scanner jour = new Scanner (System.in);
		int jj =jour.nextInt();
		
		System.out.println("veuillez saisir le mois");
		Scanner mois = new Scanner (System.in);
		int mm = mois.nextInt();
		
		System.out.println("veuillez votre année ");
		Scanner annee = new Scanner (System.in);
		int  aa = annee.nextInt();
		
		if(( aa % 4 == 0 && aa % 100!=0) || aa % 400 ==0) {
			System.out.println("Cette année est bisextille");
		}
		else {
			System.out.println(" Cette date n'est pas bisextille");
		}

	}

}
