import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {

		int age = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // gör det möjligt att få input från konsolen

		System.out.println("Hur gammal är du?");
		age = input.nextInt();

		if (age >= 18) { // (villkor) dvs man jämför i detta fal två heltal

			System.out.println("Du är gammal nog att köra bil! Grattis din jävel!");
			System.out.println("Bara så du vet så får du åka moppe också!");

		}

		else if (age > 14 && age < 18) {

			System.out.println("Du är för ung för att köra bil men du får åka moppe!");
		}

		else { // om villkoret inte uppfylls körs else
			
			System.out.println("Tyvärr, du får vänta ett tag till!");
			
		}

	}

}
