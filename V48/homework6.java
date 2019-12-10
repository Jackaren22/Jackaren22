
public class homework6 {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		// Hur många sjuor finns det?
		System.out.println("Det finns " + Sevens(numbers) + " sjuor");
		System.out.println();

		// Hur många finns det som heter Tom?
		System.out.println("Det finns hela " + Tom(names) + " personer som heter Tom");
		System.out.println();

		// Vilket nummer som återkommer mest
		System.out.println(mostNumbers(numbers) + " Är numret som återkommer mest");
		System.out.println(least(numbers) + " Är numret som återkommer minst");
		System.out.println();

		// Vilken plats i arrayen Druisilla befinner sig
		System.out.println(Drusilla(names) + " Är platsen den befinner sig på");
		System.out.println();

		// Vad summan på alla jämna tal är
		System.out.println(evenAmount(numbers) + " Är medelvärdet på alla jämna tal");
		System.out.println();

		// Antalet gånger alla siffor återkommer
		System.out.println(amountNumbers(numbers));
		System.out.println();

		// Hur många namn som har bokstaven L i sig
		System.out.println(letterL(names) + " Namn inehåller bokstaven L");
		System.out.println();

		// Hur många namn som inehåller 5 eller flera bokstäver
		System.out.println(fiveLetters(names) + " Är antalet namn som har 5 eller mera bokstäver i sig");
		System.out.println();

		// Hur många unika namn det finns
		System.out.println(uniqueNames(names) + " Är antalet unika namn");
		System.out.println();

		// Vilket namn som återkommer mest
		System.out.println(mostNames(names) + " Är namnet som återkommer mest");

	}

	public static int Sevens(int[] numbers) {

		int sevens = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				sevens++;

			}
		}
		return sevens;

	}

	public static int Tom(String[] names) {

		int tom = 0;
		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("Tom")) {
				tom++;

			}
		}
		return tom;
	}

	private static int mostNumbers(int[] numbers) {

		int most = 0;
		int amount;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}

			}

			if (amount > max) {
				most = i;
				max = amount;
			}

		}
		return most;
	}

	public static int least(int[] numbers) {
		int least = 0;
		int ammount;
		int min = 999;
		for (int i = 0; i < 10; i++) {
			ammount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					ammount++;
				}
			}
			if (ammount < min) {
				least = i;
				min = ammount;
			}

		}
		return least;
	}

	public static int Drusilla(String[] names) {
		int drusilla = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				drusilla = i;
				break;
			}
		}
		return drusilla;
	}

	public static int evenAmount(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	public static String amountNumbers(int[] numbers) {
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				zero++;
			} else if (numbers[i] == 1) {
				one++;
			} else if (numbers[i] == 2) {
				two++;
			} else if (numbers[i] == 3) {
				three++;
			} else if (numbers[i] == 4) {
				four++;
			} else if (numbers[i] == 5) {
				five++;
			} else if (numbers[i] == 6) {
				six++;
			} else if (numbers[i] == 7) {
				seven++;
			} else if (numbers[i] == 8) {
				eight++;
			} else {
				nine++;
			}
		}
		String antal = "Antal nollor: " + zero + " Antal ettor: " + one + " Antal tvåor: " + two + " Antal treor: "
				+ three + " Antal fyror: " + four + " Antal femmor: " + five + " Antal sexor: " + six + " Antal sjuor: "
				+ seven + " Antal åttor: " + eight + " Antal nior: " + nine;
		return antal;
	}

	public static int letterL(String[] names) {
		int antalL = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("L")) {
				antalL++;
			}
		}

		return antalL;
	}

	public static int fiveLetters(String[] names) {
		int fem = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				fem++;
			}
		}
		return fem;
	}

	public static int uniqueNames(String[] names) {
		int unique = 0;
		int sum = 0;

		for (int i = 0; i < names.length; i++) {
			unique = 0;
			for (int j = 0; j < names.length; j++) {
				if (names[i] == names[j]) {

					unique++;

				}

			}
			if (unique == 1) {
				sum++;
			}
		}
		return sum;
	}

	private static String mostNames(String[] names) {

		int most = 0;
		String name = null;

		for (int i = 0; i < names.length; i++) {

			int amount = 0;

			for (int j = 0; j < names.length; j++)

				if (names[j].contains(names[i])) {
					amount++;

				}
			if (amount > most) {
				most = amount;
				name = names[i];
			}
		}
		return name;
	}
}
