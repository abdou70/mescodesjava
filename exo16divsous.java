import java.util.Scanner;
public class main4 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir un entier a");
		Scanner entier1 = new Scanner (System.in);
		int a = entier1.nextInt();
		
		System.out.println("veuillez saisir un entier b");
		Scanner entier2 = new Scanner (System.in);
		int b = entier2.nextInt();
		
		int r = a-b ;
		int quot = 1 ;
		while (r >=b) {
			  r = r-b;
			 quot = quot +1 ;
		}
         System.out.println(" le quotient de a divise par b est " + quot);
	}

}
