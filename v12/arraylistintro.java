import java.util.ArrayList;
import java.util.Scanner;

public class arraylistintro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Tomas"); // På Index 0
		nameList.add("Leffe"); // På Index 1
		nameList.add(1, "Zachris"); // på Index 1 och petter blir flyttad till index 2

		for (int i = 0; i < nameList.size(); i++) { // skriver ut ArrayList inehållet mha .size() + get()
			System.out.println(nameList.get(i));
		}
		
		System.out.println();
		nameList.remove("Tomas");
		
		for (int i = 0; i < nameList.size(); i++) { // skriver ut ArrayList inehållet mha .size() + get()
			System.out.println(nameList.get(i));
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			numbers.add(i);
		}
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println(numbers);
	}

	
}
