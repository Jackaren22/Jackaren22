import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		System.out.println(tal1 < tal2 ? tal1 : tal2);

	}

}
