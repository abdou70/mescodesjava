package lescodesdeabdou;

import java.util.Scanner;

public class main0 {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir la valeur de A");
		Scanner nombre1 = new Scanner (System.in);
		
		int A = nombre1.nextInt();
		
		System.out.println("Veuillez saisir la vaeur de B");
		Scanner nombre2 = new Scanner (System.in);
		
		int B = nombre2.nextInt();
		
		System.out.println("Veuillez saisir la valeur C");
		Scanner nombre3 = new Scanner (System.in);
		
		int C = nombre3.nextInt();
		
		if (A < B && B < C) {
			
			System.out.println( A  + " < " +  B  + " < " + C );
		}
		if (A < C && C < B) {
			
			System.out.println(A + " < " + C + " < " + B);
		}
		if (B < A && A < C) {
			System.out.println(B + " < " + A + " < " + C);
		}
		if (B < C && C < A) {
			System.out.println(B + " < " + C + " < " + A);
		}
		if (C < A && A < B) {
			System.out.println(C + " < " + A + " < " + B);
		}
		if (C < B && B < A) {
			System.out.println(C + " < " + B + " < " + A);
		}
	}

}
