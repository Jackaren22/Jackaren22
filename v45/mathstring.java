import java.util.Scanner;

public class mathstring {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2) + 4));
				
				//System.out.println(svar);
				
				double pi = Math.PI;
				
				//System.out.println(pi);
				
	    double largest = Math.max(svar, pi);                                     // Tar fram st�rsta tal
	    
	   // System.out.println(largest);
	    
	    String mening = "Tomas �r sexig och gudlig";
	    System.out.println(mening);

	    Scanner input = new Scanner(System.in);
	    
	    String mening2 = input.nextLine();
	    
	    if (mening.equals(mening2)) {                                            // Kollar om b�da stringsen �r likadana.
	    	
	    	System.out.println("Samma mening");
	    	
	    }
	    
	    System.out.println(mening.length());                                     //Visar hur m�nga tecken en string ineh�ller
	    System.out.println(mening.toUpperCase());                                // G�r en string till bara stora bokst�ver
	    System.out.println(mening.toLowerCase());                                // G�r en string till bara sm� bokst�ver
	    System.out.println(mening.contains("Tomas"));                            // Kollar om ett specefikt ord/tecken finns i stringen
	    System.out.println("      tomaS du �r cool      ".trim());               // Tar bort mellan slag som �r p� sidorna, allts� inga mellanslag i mitten.
	    System.out.println("      tomaS du �r cool      ".trim().toLowerCase()); // Man kan anv�nda flera samtidigt, den som skrivs f�rst g�rs f�rst
	    System.out.println(mening.replace('i', 'q'));                            // Byter ut tecken mot ett annat tecken
	    
	    int a = 7;
	    int b = 3;
	    
	    double answer = (double)a / (double)b;                                   // G�r a och b tempor�rt till doubles �ven om de �r in
	    
	    
	    System.out.println(answer);
	    
	}

}
