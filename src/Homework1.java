import java.util.Scanner; // beh�vs om man vill ha input

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in); // beh�vs om man vill ha input
		
		System.out.println("What is your name? "); // skriver ut ett meddelande
		
		String name = input.nextLine(); // l�ser in ett namn fr�n konsolen

		System.out.println("How old are you? ");
		
		String age = input.nextLine();
		
		System.out.println("What is your adress? ");
		
		String adress = input.nextLine();
		
		System.out.println("What is your ZIP code? ");
		
		String zipcode = input.nextLine();
		
		System.out.println("What city do you live in? ");
		
		String city = input.nextLine();
		
		System.out.println("What is your phonenumber? ");
		
		String number = input.nextLine();
		
		
		 
		
		
		
		System.out.println("Information:");
		System.out.println("Name:" + "\t" + "\t" + name + "\n" + "Age:" + "\t" + "\t"+ age + "\n" + "Adress:" + "\t" + "\t" +  adress +
				"\n" +  "\t" + "\t" +zipcode + "\n"  + "\t" + "\t" + city + "\n" + "Number:" + "\t" + "\t" + number);

	}

}
