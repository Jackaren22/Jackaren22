import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraylistuppgifter {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		// List g�r s� man kan simpelt l�gga en flera saker i en ArrayList
		List<String> name = Arrays.asList("Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius Anton" , "Jensl�v Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindstr�m Linus" , "Markstr�m Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" , "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" , "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandstr�m Ludvig" , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thil�n Philip" , "Utbult David" , "Vins Andreas"); 
		
		nameList.addAll(name);
		
		for (int i = 0; i < nameList.size(); i++) { // Uppgift 1
			System.out.println(nameList.get(i));
		}
		
		Collections.swap(nameList, 4, 9); // Byter tv� indexes med varandra med hj�lp av Collections.swap
		
		for (int i = 0; i < nameList.size(); i++) {  // Uppgift 2
			System.out.println(nameList.get(i));
		}
		
		nameList.add(0, "Billskog Gabriel"); // L�gger in gabbe som index 0
		
		for (int i = 0; i < nameList.size(); i++) { // Uppgift 3
			System.out.println(nameList.get(i));
		}
		
		for (int i = 0; i < nameList.size(); i++) { 
			
			System.out.println(nameList.get(i));
		}

		// Ta bort alla namn som b�rjar p� bokstaven L och skriv ut listan

		// Flytta ditt namn till f�rsta platsen och skriv ut listan
		
		// Sortera namnlistan omv�nd fr�n � till A
		
	}
	
}