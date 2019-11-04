import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int digit;
		int number;
		int sum = 0;
		
		System.out.println("Skriv ett heltal bitch:");
		
		number = input.nextInt();
		
		while (number != 0) {
			
			digit = number % 10;
			sum += digit;
			number /= 10;
		}
		
		System.out.println(sum);
		System.out.println("ZACHRIS ÄR GAY HAHAHAHAHAHAHAHAHAH");
		

	}

}
