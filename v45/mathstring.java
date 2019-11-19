import java.util.Scanner;

public class mathstring {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2) + 4));
				
				//System.out.println(svar);
				
				double pi = Math.PI;
				
				//System.out.println(pi);
				
	    double largest = Math.max(svar, pi);                                     // Tar fram största tal
	    
	   // System.out.println(largest);
	    
	    String mening = "Tomas är sexig och gudlig";
	    System.out.println(mening);

	    Scanner input = new Scanner(System.in);
	    
	    String mening2 = input.nextLine();
	    
	    if (mening.equals(mening2)) {                                            // Kollar om båda stringsen är likadana.
	    	
	    	System.out.println("Samma mening");
	    	
	    }
	    
	    System.out.println(mening.length());                                     //Visar hur många tecken en string inehåller
	    System.out.println(mening.toUpperCase());                                // Gör en string till bara stora bokstäver
	    System.out.println(mening.toLowerCase());                                // Gör en string till bara små bokstäver
	    System.out.println(mening.contains("Tomas"));                            // Kollar om ett specefikt ord/tecken finns i stringen
	    System.out.println("      tomaS du är cool      ".trim());               // Tar bort mellan slag som är på sidorna, alltså inga mellanslag i mitten.
	    System.out.println("      tomaS du är cool      ".trim().toLowerCase()); // Man kan använda flera samtidigt, den som skrivs först görs först
	    System.out.println(mening.replace('i', 'q'));                            // Byter ut tecken mot ett annat tecken
	    
	    int a = 7;
	    int b = 3;
	    
	    double answer = (double)a / (double)b;                                   // Gör a och b temporärt till doubles även om de är in
	    
	    
	    System.out.println(answer);
	    
	}

}
