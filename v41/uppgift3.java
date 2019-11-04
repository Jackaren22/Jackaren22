import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double total = 0;
		double antal = 0;
		double i = 5;
		
		
		while( i > 0 ) {
			System.out.println("Write a number, Press 0 to Stop");
			i = input.nextDouble();
			total = total + i;
		    antal++;

			
		}
		    antal--;
			double medel = total / antal;
			System.out.println("Totalt:" + total + "\n" + "Medelvärde:" + medel);
		}
	
	

	}


