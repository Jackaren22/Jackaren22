import java.util.Scanner;

public class Talspelet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the most epic game you will have ever played! Guess the fucking number :) ");
		System.out.println("I will generate a number that you will have to try to guess!");
		System.out.println("Please pick a difficulty to play.");
		System.out.println();
		System.out.println("(1) Easy");
		System.out.println("(2) Medium");
		System.out.println("(3) Hard");
		System.out.println();
		
		int startoption = input.nextInt();

		switch (startoption) {
		case 1:
		System.out.println("Easy was picked");
		break;
		case 2:
		System.out.println("Medium was picked");
		break;
		case 3:
		System.out.println("Hard was picked");
		break;
		
		default:
			System.out.println("du har problem din mongolid");
			break;
		
		}
		if (startoption == 1) {
			long number = Math.round(Math.random() * 100);
			
			System.out.println(number);
		}

		if (startoption == 2) {
			
		}
		
		if (startoption == 3) {
			
		}
	}
}
		
	

