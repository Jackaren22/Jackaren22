import java.util.Scanner;

public class Talspelet {

	public static void main(String[] args) {

		@SuppressWarnings("resource") // Tar bort varningar som har med ost�ngda variabler, i detta fallet input
		Scanner input = new Scanner(System.in);

		int playagain = 1;
		while (playagain == 1) { // En while loop �ver hela koden s� att det g�r att k�ra programmet igen

			System.out.println("Welcome to the most epic game you will have ever played! Guess the fooking number :) ");
			System.out.println("I will generate a number that you will have to try to guess!");
			System.out.println("Please pick a difficulty to play." + "\n");
			System.out.println("(1) Easy   - 10 Lives - Random Number Between 0-100" + "\n"
					+ "(2) Medium - 5 Lives  - Random Number Between 0-100" + "\n"
					+ "(3) Insane - 1 Life   - Random Number Between 0-100" + "\n"
					+ "(4) Custom - Custom   - Random Number Between 0-Custom");

			int startoption = 0;

			try { // Try catch f�r att se till att anv�ndaren inte crashar programmet

				startoption = input.nextInt();

				if (startoption == 1) {

					easy();
					playagain = input.nextInt(); // Om anv�ndarern skriver in 1 kommer programmet startas om annars
													// st�ngs det ned
					if (playagain != 1) {
						System.out.println("Thanks for playing!");
					}

				}

				if (startoption == 2) {

					medium();
					playagain = input.nextInt();
					if (playagain != 1) {
						System.out.println("Thanks for playing!");
					}

				}

				if (startoption == 3) {

					insane();
					playagain = input.nextInt();
					if (playagain != 1) {
						System.out.println("Thanks for playing!");
					}

				}
				if (startoption == 4) {

					custom();
					playagain = input.nextInt();
					if (playagain != 1) {
						System.out.println("Thanks for playing!");
					}
				}
			} catch (Exception e) {
				System.out.println("Invalid Input... Please restart the program and follow the instructions correctly");
				break;
			}
		}
	}

	/**
	 * L�ttaste sv�righetsgraden, Den genererar fram ett slumpat tal mellan 0-100
	 * som anv�ndaren ska gissa p� Man f�r 10 gissningar p� sig, jag har if satser
	 * f�r att visa om talet �r h�gre eller l�gre
	 */

	public static void easy() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("You have chosen the Easy difficulty");
		int tries = 10; // Antal f�rs�k man f�r p� sig
		long number = Math.round(Math.random() * 100); // Slumpad siffra mellan 0 - 100

		while (tries != 0) {

			System.out.println("You have " + tries + " attempts left");
			tries--;
			int guess = 0;
			try {
				guess = input.nextInt();
			}

			catch (Exception e) {
				System.out.println("\n" + "Invalid Input... Would you like to restart the game?" + "\n");
				System.out.println("(1) Yes (2) No");
				break;
			}

			if (guess == number) {
				System.out.println("\n" + "You guessed the number! Good job!");
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (tries == 0) {
				System.out.println("\n" + "Oh no you ran out of tries...");
				System.out.println("The number was " + number);
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (guess > number) {
				System.out.println("The hidden number is smaller than your number");
			} else if (guess < number) {
				System.out.println("The hidden number is larger than your number");
			}
		}
	}

	/**
	 * Mitimellan sv�righetsgraden, Den genererar fram ett slumpat tal mellan 0-100
	 * som anv�ndaren ska gissa p� Man f�r 5 gissningar p� sig, jag har if satser
	 * f�r att visa om talet �r h�gre eller l�gre
	 */

	public static void medium() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("You have chosen the Medium difficulty");
		int tries = 5;
		long number = Math.round(Math.random() * 100);

		while (tries != 0) {

			System.out.println("You have " + tries + " attempts left");
			tries--;
			int guess = 0;
			try {
				guess = input.nextInt();
			}

			catch (Exception e) {
				System.out.println("\n" + "Invalid Input... Would you like to restart the game?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			}
			if (guess == number) {
				System.out.println("\n" + "You guessed the number! Good job!");
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (tries == 0) {
				System.out.println("\n" + "Oh no you ran out of tries...");
				System.out.println("The number was " + number);
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (guess > number) {
				System.out.println("The hidden number is smaller than your number");
			} else if (guess < number) {
				System.out.println("The hidden number is larger than your number");
			}
		}
	}

	/**
	 * Sv�raste sv�righetsgraden, Den genererar fram ett slumpat tal mellan 0-100
	 * som anv�ndaren ska gissa p� Man f�r bara en gissning s� if satser f�r att
	 * visa om den �r h�gre eller l�gre �r orelevant
	 */

	public static void insane() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("You have chosen the Insane difficulty");
		int tries = 1;
		long number = Math.round(Math.random() * 100);

		while (tries != 0) {

			System.out.println("You only have " + tries + " attempt!!! Make it count!");
			tries--;
			int guess = 0;
			try {
				guess = input.nextInt();
			}

			catch (Exception e) {
				System.out.println("\n" + "Invalid Input... Would you like to restart the game?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			}

			if (guess == number) {
				System.out.println("\n" + "You guessed the number! Good job!");
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (tries == 0) {
				System.out.println("\n" + "Oh no you ran out of tries...");
				System.out.println("The number was " + number);
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			}
		}
	}

	/**
	 * Sv�righetsgrad som anv�ndaren sj�lv �ndrar p�, den kommer generera fram en
	 * siffra mellan 0 och anv�ndarens val Sen f�r anv�ndaren �ven v�lja antal
	 * gissningar man ska ha p� sig, jag har if satser f�r att visa om talet �r
	 * h�gre eller l�gre
	 */

	public static void custom() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("You have chosen the Custom difficulty");

		System.out.println("Please insert how many attemps you would like to have");
		long tries = input.nextLong(); // V�ljer hur m�nga f�rs�k man f�r p� sig

		System.out.println(
				"Now choose how high the number is allowed to be. The number will be between 0 and the number you pick right now");
		long numberbig = input.nextLong(); // V�ljer max valutan den g�mda siffran kommer vara

		long number = Math.round(Math.random() * numberbig);

		while (tries != 0) {
			System.out.println("You have " + tries + " attempts left");
			tries--;
			int guess = 0;
			try {
				guess = input.nextInt();
			}

			catch (Exception e) {
				System.out.println("\n" + "Invalid Input... Would you like to restart the game?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			}

			if (guess == number) {
				System.out.println("\n" + "You guessed the number! Good job!");
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (tries == 0) {
				System.out.println("\n" + "Oh no you ran out of tries...");
				System.out.println("The number was " + number);
				System.out.println("Would you like to play again?" + "\n");
				System.out.println("(1) Yes (Any other letter) No");
				break;
			} else if (guess > number) {
				System.out.println("The hidden number is smaller than your number");
			} else if (guess < number) {
				System.out.println("The hidden number is larger than your number");
			}

		}
	}
}
