import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraylistuppgifter {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		// List gör så man kan simpelt lägga en flera saker i en ArrayList
		List<String> name = Arrays.asList("Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius Anton" , "Jenslöv Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindström Linus" , "Markström Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" , "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" , "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandström Ludvig" , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thilén Philip" , "Utbult David" , "Vins Andreas"); 
		
		nameList.addAll(name);
		
		for (int i = 0; i < nameList.size(); i++) { // Uppgift 1
			System.out.println(nameList.get(i));
		}
		
		Collections.swap(nameList, 4, 9); // Byter två indexes med varandra med hjälp av Collections.swap
		
		for (int i = 0; i < nameList.size(); i++) {  // Uppgift 2
			System.out.println(nameList.get(i));
		}
		
		nameList.add(0, "Billskog Gabriel"); // Lägger in gabbe som index 0
		
		for (int i = 0; i < nameList.size(); i++) { // Uppgift 3
			System.out.println(nameList.get(i));
		}
		
		for (int i = 0; i < nameList.size(); i++) { 
			
			System.out.println(nameList.get(i));
		}

		// Ta bort alla namn som börjar på bokstaven L och skriv ut listan

		// Flytta ditt namn till första platsen och skriv ut listan
		
		// Sortera namnlistan omvänd från Ö till A
		
	}
	
}