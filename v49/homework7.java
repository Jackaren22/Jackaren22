import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);

		int choice;

		System.out.println("Welcome, choose the path you would like to take");
		System.out.println("1 = Beach");
		System.out.println("2 = Mysterious Forest");
		System.out.println("3 = Highlands");
		System.out.println("4 = Central City");
		System.out.println("5 = Dark Woods");
		System.out.println("6 = EXIT GAME");

		choice = input.nextInt();

		switch (choice) {
		case 1:
		int Scenario1p1 = 0;
		System.out.println(Scenario1(Scenario1p1));
		
		
		case 2:
		System.out.println("Välj spel att starta");
		break;
		case 3:
		System.out.println("Ljud, video, kontroller");
		break;
		case 4:
		System.out.println("Stänger av...");
		break;
		case 5:
		System.out.println("Big Obama Man");
		break;
		case 6:
		System.out.println("Bye bye :(");
		break;

		default:
		System.out.println("..." );
		break;
		}
	}
	public static int Scenario1(int Scenario1p2) {
		
	System.out.println("You decide to go to the beach and have a great time when suddenly a volleyball is comming straight at you!");
	System.out.println();
	System.out.println("- What do you do?");
	System.out.println();
		
	System.out.println("(1) - Smash it right back where it came from! ");
	System.out.println("(2) - Stand your ground and take it like a man");
	System.out.println("(3) - Do a ninja move and dodge it ");
	System.out.println("(4) - BACK TO MAIN MENU");
	
	Scanner input = new Scanner(System.in);
	int Scenario1c1 = input.nextInt();
	
		switch (Scenario1c1) { 
		case 1:
		System.out.println();
		System.out.println("You smash the ball too hard and murder a cute girl, shame on you");
		System.out.println();
		System.out.println("- THE END -");
		break;
		
		case 2: 
		System.out.println();
		System.out.println("You thought you took the ball like a man but in reality you just die");
		System.out.println();
		System.out.println("- THE END -");
		break;
		case 3:
		System.out.println("You try to do some sort of ninja move but you fail miserably, but you atleast manage to dodge the ball");
		System.out.println("- GOOD END -");
		break;
		case 4:
		System.out.println("Returning to main menu...");
		
		}
		if (Scenario1c1 == 4) {
			System.out.println();
		}
		return Scenario1c1; 

	}
}
