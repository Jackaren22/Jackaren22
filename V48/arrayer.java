import java.util.Scanner;

public class arrayer {

	
	public static void main(String[] args) {

	
		Scanner input = new Scanner(System.in);
		
		int[] nummer = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Skapar en array och fyller den med 10 tal
		
		int[] nummer2 = new int[10]; // Skapar en array med 10 tomma lådor
		
		int[] summa = new int[10];
		
		for (int i = 0; i < nummer2.length; i++) { // Fyller array 2 med input från konsolen
			nummer2[i] = input.nextInt();
		}
		
		for (int i = 0; i < summa.length; i++) { // Loopar genom nummer[] och skriver ut inehållet
			summa[i] = nummer[i] + nummer2[i];
		}
		
		for (int i = 0; i < nummer.length; i++) { // Loopar genom nummer[] och skriver ut inehållet
			System.out.println(nummer[i]);
			System.out.println(i);
		}

	}

}
