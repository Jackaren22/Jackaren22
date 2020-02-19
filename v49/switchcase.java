import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);

		int choice;

		System.out.println("Välkommen, välj ett alternativ:");
		System.out.println("1 = New game");
		System.out.println("2 = Load game");
		System.out.println("3 = Options");
		System.out.println("4 = Exit game");
		System.out.println("5 = Credits");

		choice = input.nextInt();

		switch (choice) {
		case 1:
		System.out.println("Spelet startar...");
		break;
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

		default:
		System.out.println("du har problem din mongolid");
		break;
		}
	}

}
