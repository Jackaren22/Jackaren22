import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class hangmangame {

	public static String[] wordlist = { "Book", "Tree", "Cloud", "School", "Apple", "Monkey", "Money", "Computer", "Phone", "Firework", "Wolf", "Earthquake", " Obama", "Dinosaur", "Car", "House"
			, "Tiger", "Mouse", "Pear", "Pokemon", "Ocean", "Boat", "Airplane"}; // Ordlista som anv�nds i spelet
	public static String answer = Randomizer().toLowerCase(); // Slumpat ord fr�n ordlistan
	public static char[] hiddenword = Hiddenword(answer); // Det slumpade ordet fast det �r g�mt
	public static String transform = new String(hiddenword); // Omvandlar den g�mda char arrayen till en String
	public static int tries = 10; // Antal f�rs�k
	/*
	 * Main metoden anv�nder sig utav alla submetoder jag har, jag planerar p� att tunna ned det lite mer ocks�, �ven ifall det �r relativt lite i main metoden enligt mig
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int playagain = 1;
		
		while (playagain == 1) { // Simpel while loop f�r att kunna k�ra spelet flera g�nger
		
		tries = 10; // H�r k�r jag om flera saker som sker utanf�r koden, detta �r f�r att annars hade det inte varit ett nytt ord om man startar om spelet genom while loopen.
		answer = Randomizer().toLowerCase();
		hiddenword = Hiddenword(answer);
		transform = new String(hiddenword);
		
		StartMenu(); 
		
		int mode = input.nextInt();
		List<String> guessedletters = new ArrayList<String>(); // Denna Arraylisten kommer lista upp allt som man har gissat p�.
		
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
     * Jag var os�ker hur jag skulle g�ra denna delen smidigt s� jag kollade upp hur andra h�ngagubbe spel gjorde det och skrev en liknande metod
     * Sidan jag anv�nde var "https://gist.github.com/SedaKunda/79e1d9ddc798aec3a366919f0c14a078" 
     * 
     * Denna metoden kollar om bokstaven som har matats in av spelaren finns i det g�mda ordet. Om bokstaven finns i ordet s� kommer platserna d�r bokstaven ska vara bytas in mot
     * bindes str�cken. 
     * 
     * .charAt(0) �r d�r f�r att se till att spelaren enbart kan gissa p� EN bokstav och om de skriver mer �n en bokstav kommer den enbart r�kna f�rsta bokstaven
     * += Anv�nds f�r att kombinera de olika stringsen ist�llet f�r att byta ut stringen helt
     */
	public static void guess(String guess) {
		
    	String progress = "";
    	
    	for (int i = 0; i < answer.length(); i++) {
    		if (answer.charAt(i) == guess.charAt(0)) { // Denna if satsen �r den som l�gger till bokst�ver som man har gissat r�tt p�
    			progress +=  guess.charAt(0);
    		}
    		else if (transform.charAt(i) != '-') { // Denna if satsen kommer att l�gga till alla bokst�ver som redan har blivit hittande s� att inte framstegen p� det hemliga ordet tas bort.
    			progress += answer.charAt(i);
    		}
    		else {
    			progress += "-"; // Ifall ingen av de andra if satserna uppfylls s� kommer denna skriva ut ett likadant g�mt ord som transform s� att n�r transform = progress upfylls s� orsakas det inga problem 
  
    		}
    		
    	}
    	
    	if (guess.equals(answer)) { // Denna if sats l�ter spelet avslutas om man gissar hela ordet direkt
    		transform = guess;
    	}
    	
    	else if (transform.equals(progress)) {
    		tries--;
    		System.out.println("Wrong guess, you have " + tries + " guesses left");
    	}
    	else {
    		transform = progress; // H�r blir det g�mde ordet samma String som progress s� om progress har blivit ifyllt med en eller flera bokst�ver kommer det att visas
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
     * Denna metod tar slumpm�ssigt fram ett tal fr�n 0 - antalet ord i ord listan. N�r den har slumpat ett tal kommer den att ta ordert som �r p� den platsen som talet visar.
     */
    public static String Randomizer() {
    	int randomizer = (int) (Math.random() * wordlist.length);
		return wordlist[randomizer];
    }
    /*
     * Denna metod skapar en array som �r lika long som det valda ordet fr�n ordlistan och producerar sedan bindestr�ck som anv�nds f�r att visa hur l�ngt ordet �r som man gissar p�
     * utan att visa vad ordet faktist �r
     */
    public static char[] Hiddenword(String answer) {
    
    char[] hiddenanswer = new char[answer.length()];
    for (int i = 0; i < answer.length(); i++) {
    	hiddenanswer[i] = '-';	  
    	}
	return hiddenanswer;
    }

}


