import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class hangmangame {

	public static String[] wordlist = { "Book", "Tree", "Cloud", "School", "Apple", "Monkey", "Money", "Computer", "Phone", "Firework", "Wolf", "Earthquake", " Obama", "Dinosaur", "Car", "House"
			, "Tiger", "Mouse", "Pear", "Pokemon", "Ocean", "Boat", "Airplane"}; // Ordlista som används i spelet
	public static String answer = Randomizer().toLowerCase(); // Slumpat ord från ordlistan
	public static char[] hiddenword = Hiddenword(answer); // Det slumpade ordet fast det är gömt
	public static String transform = new String(hiddenword); // Omvandlar den gömda char arrayen till en String
	public static int tries = 10; // Antal försök
	/*
	 * Main metoden använder sig utav alla submetoder jag har, jag planerar på att tunna ned det lite mer också, även ifall det är relativt lite i main metoden enligt mig
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int playagain = 1;
		
		while (playagain == 1) { // Simpel while loop för att kunna köra spelet flera gånger
		
		tries = 10; // Här kör jag om flera saker som sker utanför koden, detta är för att annars hade det inte varit ett nytt ord om man startar om spelet genom while loopen.
		answer = Randomizer().toLowerCase();
		hiddenword = Hiddenword(answer);
		transform = new String(hiddenword);
		
		StartMenu(); 
		
		int mode = input.nextInt();
		List<String> guessedletters = new ArrayList<String>(); // Denna Arraylisten kommer lista upp allt som man har gissat på.
		
		if (mode == 2) {
			System.out.println("Player 1 Please input the word you would like Player 2 to guess");
			answer = input.next();
			hiddenword = Hiddenword(answer);
			transform = new String(hiddenword);
			System.out.println("It is now time for Player 2 to guess the word!");
			
		}
		
		
		while (tries > 0 && transform.contains("-")) {
			System.out.println();
			System.out.println("Guess a letter in the word!");
			System.out.println(transform);
			System.out.println(guessedletters);
			String guess = input.next();
			guess.toLowerCase();
			guessedletters.add(guess);
			guess(guess);
		}
			
		if (tries == 0) {
			System.out.println();
			System.out.println("ur ded bye bye :(");
			System.out.println();
			System.out.println("Would you like to play again?");
			System.out.println("(1) Yes  Any other number = No");
			playagain = input.nextInt();
		}
		
		else {
			System.out.println();
			System.out.println("You did it!!!" + "The word was " + answer);
			System.out.println("Would you like to play again?");
			System.out.println("(1) Yes  Any other number = No");
			playagain = input.nextInt();
		}

	    }
	}
    /*
     * Jag var osäker hur jag skulle göra denna delen smidigt så jag kollade upp hur andra hängagubbe spel gjorde det och skrev en liknande metod
     * Sidan jag använde var "https://gist.github.com/SedaKunda/79e1d9ddc798aec3a366919f0c14a078" 
     * 
     * Denna metoden kollar om bokstaven som har matats in av spelaren finns i det gömda ordet. Om bokstaven finns i ordet så kommer platserna där bokstaven ska vara bytas in mot
     * bindes sträcken. 
     * 
     * .charAt(0) är där för att se till att spelaren enbart kan gissa på EN bokstav och om de skriver mer än en bokstav kommer den enbart räkna första bokstaven
     * += Används för att kombinera de olika stringsen istället för att byta ut stringen helt
     */
	public static void guess(String guess) {
		
    	String progress = "";
    	
    	for (int i = 0; i < answer.length(); i++) {
    		if (answer.charAt(i) == guess.charAt(0)) { // Denna if satsen är den som lägger till bokstäver som man har gissat rätt på
    			progress +=  guess.charAt(0);
    		}
    		else if (transform.charAt(i) != '-') { // Denna if satsen kommer att lägga till alla bokstäver som redan har blivit hittande så att inte framstegen på det hemliga ordet tas bort.
    			progress += answer.charAt(i);
    		}
    		else {
    			progress += "-"; // Ifall ingen av de andra if satserna uppfylls så kommer denna skriva ut ett likadant gömt ord som transform så att när transform = progress upfylls så orsakas det inga problem 
  
    		}
    		
    	}
    	
    	if (guess.equals(answer)) { // Denna if sats låter spelet avslutas om man gissar hela ordet direkt
    		transform = guess;
    	}
    	
    	else if (transform.equals(progress)) {
    		tries--;
    		System.out.println("Wrong guess, you have " + tries + " guesses left");
    	}
    	else {
    		transform = progress; // Här blir det gömde ordet samma String som progress så om progress har blivit ifyllt med en eller flera bokstäver kommer det att visas
    	}
    }
    /*
     * Denna metod skickar bara ut intruktioner vid starten av programmet.
     */
    public static void StartMenu(){
    	System.out.println();
    	System.out.println("Welcome to my next game in the epic series of games called the Hangman Game!");
    	System.out.println("It works just like the normal hangman game, there will be a secret word that you will have to figure out by guessing what letters the word contains");
    	System.out.println("Would you like to play alone or against another Player?");
    	System.out.println();
    	System.out.println("(1) SinglePlayer  [A random word for a wordlist will be picked and you have to figure out the word");
    	System.out.println("(2) 2 Player Mode [One player picks a word and then gives the computer to the other player and they have to figure out the word");
    	System.out.println();
    	System.out.println("WARNING: IF YOU TYPE ANYTHING ELSE BUT NUMBERS THE GAME WILL CRASH, ALSO IF YOU TYPE ANY OTHER NUMBER THAN 1 THE GAME WITH AUTOMATICALY BE PUT INTO SINGLEPLAYER");
      }
    /*
     * Denna metod tar slumpmässigt fram ett tal från 0 - antalet ord i ord listan. När den har slumpat ett tal kommer den att ta ordert som är på den platsen som talet visar.
     */
    public static String Randomizer() {
    	int randomizer = (int) (Math.random() * wordlist.length);
		return wordlist[randomizer];
    }
    /*
     * Denna metod skapar en array som är lika long som det valda ordet från ordlistan och producerar sedan bindesträck som används för att visa hur långt ordet är som man gissar på
     * utan att visa vad ordet faktist är
     */
    public static char[] Hiddenword(String answer) {
    
    char[] hiddenanswer = new char[answer.length()];
    for (int i = 0; i < answer.length(); i++) {
    	hiddenanswer[i] = '-';	  
    	}
	return hiddenanswer;
    }

}


