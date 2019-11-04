import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class homework5 {

	public static void main(String[] args) {

		lol();
		max();
		count();
		kelvin();
		fahrenheit();
		ageControl();
		stair();
		
		
	}


    public static void lol() {
		
		System.out.println("HAHAHAHAHAHAHA.");
		
	}
    public static void max() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 2 heltal.");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a > b ? a : b); // ? Använder jag istället för if statements då det är snabbare och simplare.
		
		
	}
    public static void count() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv valfri siffra");
		
		int n = input.nextInt();
		int start = 0;
		
		while (start < n) {
			start++;
			System.out.println(start); }
    }
		
	    public static void kelvin() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Put in a number (tempreature in kelvin) to convert to celcius");
			
			double celcius = input.nextDouble();
			
			double kelvinToCelsius = -273.15;
			
			System.out.println(kelvinToCelsius + celcius);
			
		}
	    
	    public static void fahrenheit() {
	    	
			Scanner input = new Scanner(System.in);
			
			System.out.println("Put in a number (tempreature in fahrenheit) to convert to celcius");
	        
			double fahrenheit = input.nextDouble();
			
			fahrenheit = (fahrenheit-32)/1.8;
	        
	        System.out.println(fahrenheit);
	        
	    }
	    
	    public static void ageControl() {
	    	
	    	Scanner input = new Scanner(System.in);
	    	
	    	System.out.println("Put in your age");
	    	
	    	int age = input.nextInt();
	    			
	    	
	        if (age <= 5) {
	            System.out.println("Småbarn får inte göra något.");
	        }

	        else if(age <= 12) {
	            System.out.println("Du får spela Fortnite.");
	        }

	        else if(age <= 14) {
	            System.out.println("Du är tonåring.");
	        }

	        else if(age <= 17) {
	            System.out.println("Du får köra moppe.");
	        }

	        else if(age <= 20) {
	            System.out.println("Du får köra bil.");
	        }

	        else if(age <= 64) {
	            System.out.println("Du får vuxenstraff om du gör något dumt.");
	        }

	        else if(age <= 99) {
	            System.out.println("Du är pensionär.");
	        }

	        else {
	            System.out.println("R.I.P?");
	        }
	    }
	    public static void stair() {
	    	
	    	Scanner input = new Scanner(System.in);
	    	
	    	System.out.println("Choose how long you want your stairs to be");
	    	
	    	int steps = input.nextInt();
	        int step;
	        for (int i = 1; i <= steps; i++) {

	            step = steps - i;
	            for (int j = 0; j < steps; j++) {
	                if (j < step) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print("X");

	                }
	            }
	            System.out.println();
	        }
	    }
}
		

