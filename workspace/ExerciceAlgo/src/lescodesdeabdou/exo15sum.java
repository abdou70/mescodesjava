import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir entier");
		Scanner entier = new Scanner (System.in);
		
		int n = entier.nextInt();
		int i = 0;
		int som = 0;
		while (i <= n) {
			som = som +i ;
			i = i+1;
		}
		 double moyy = som/n;
       System.out.println("la somme des entiers de 1 � " + n + " est :" + som); 
       System.out.println("la moyenne est " + moyy );
	}

}
