import java.util.Scanner; // behövs om man vill ha input

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in); // behövs om man vill ha input
		
		System.out.println("What is your name? "); // skriver ut ett meddelande
		
		String name = input.nextLine(); // läser in ett namn från konsolen

		System.out.println("How old are you? ");
		
		String age = input.nextLine();
		
		System.out.println("\n\tInformation:");
		System.out.println(name + "\n" + age);

	}

}
