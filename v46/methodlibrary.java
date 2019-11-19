import java.util.Scanner;

public class methodlibrary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in en mening som inehåller bokstaven u minst en gång");
		String mening3 = input.nextLine();
		System.out.println(Ok(mening3));

		System.out.println("Fahrenheit -> Kelvin");
		double fahrenheit = input.nextDouble();
		System.out.println(FTK(fahrenheit));

		System.out.println("Kelvin -> Celcius");
		double kelvin = input.nextDouble();
		System.out.println(KTC(kelvin));

		System.out.println("km/h -> m/s");
		double km = input.nextDouble();
		System.out.println(KMTM(km));

		System.out.println("Skriv in massa och sedan hastighet för att få ut kinetisk energi");
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		System.out.println(Kinetisk(massa, hastighet));

		System.out.println("Skriv in massa och sedan höjd för att få ut potensial energi");
		double massa2 = input.nextDouble();
		double höjd = input.nextDouble();
		System.out.println(Potensial(massa2, höjd));

		System.out.println("Skriv in 3 olika tal och få ut medelvärdet");
		double ett = input.nextDouble();
		double två = input.nextDouble();
		double tre = input.nextDouble();
		System.out.println(Medel(ett, två, tre));

		String mening = "PaParaZZi";
		System.out.println(SBTSB(mening));

		String mening2 = "Jag vill bli godkänd i programmering! <3";
		System.out.println(Programmering(mening2));

		System.out.println("Skriv in sträcka och hastighet och få ut tids enheten det tar");
		double sträcka = input.nextDouble();
		double hastighet2 = input.nextDouble();
		System.out.println(Time(sträcka, hastighet2));

		System.out.println("Skriv in kraft och sträcka och få ut arbete");
		double kraft = input.nextDouble();
		double sträcka2 = input.nextDouble();
		System.out.println(Arbete(kraft, sträcka2));

		System.out.println("Skriv in hastighet för att få ut hur högt ett föremål som kommer uppåt åker");
		double hastighet3 = input.nextDouble();
		System.out.println(Höjd(hastighet3));

		System.out.println("Skriv in volym av en sfär och få ut radie");
		double volym = input.nextDouble();
		System.out.println(Volym(volym));

		System.out.println("Skriv in en bas och en höjd för att räkna ut en triangels area");
		double bas = input.nextDouble();
		double höjd2 = input.nextDouble();
		System.out.println(Triangel(bas, höjd2));

	}

	/**
	 * Denna metod tar in ett tal som ska representera fahrenheit och sen så
	 * omnvadlar metoden fahrenheit värdet till kelvin. Det jag har inne i koden är
	 * då omvandlingen till kelvin från fahrenheit
	 * 
	 * @param fahrenheit
	 * @return Kelvin
	 */
	public static double FTK(double fahrenheit) { // FTK = Fahrenheit to Kelvin

		double celcius = (fahrenheit - 32) / 1.8;
		double kelvin = celcius + 273.15;
		return kelvin;

	}

	/**
	 * Denna metod är exakt lika dan som den tidigare metod bara att denna omvandlar
	 * Kelvin till celcius istället
	 * 
	 * @param kelvin
	 * @return Celcius
	 */
	public static double KTC(double kelvin) { // KTC = Kelvin to Celcius

		double celcius = kelvin - 273.15;
		return celcius;

	}

	/**
	 * Denna metod är också en omvandlare men den omvandlar istället km/h till m/s
	 * 
	 * @param km
	 * @return m/s
	 */
	public static double KMTM(double km) { // KMTM = km/h to m/s

		double m = km / 3.6;
		return m;

	}

	/**
	 * Denna metod tar in en massa och hastighet och multiplicerar den för att få ut
	 * kinetisk energi
	 * 
	 * @param massa
	 * @param hastighet
	 * @return kinetisk energi
	 */
	public static double Kinetisk(double massa, double hastighet) {

		double kinetisk2 = massa * hastighet;
		double kinetisk = (Math.pow(kinetisk2, 2) / 2);
		return kinetisk;

	}

	/**
	 * Denna metod tar in massa och höjd och multiplicerar de värderna med varandra
	 * för och sen multipliceras det värdet med gravitation för att få ut potensial
	 * energi
	 * 
	 * @param massa2
	 * @param höjd
	 * @return potensial energi
	 */
	public static double Potensial(double massa2, double höjd) {

		double potensial = massa2 * höjd * 9.82;
		return potensial;

	}

	/**
	 * Denna metod tar in 3 olika tal och tar sedan fram medelvärdet
	 * 
	 * @param ett
	 * @param två
	 * @param tre
	 * @return Medelvärdet
	 */
	public static double Medel(double ett, double två, double tre) {

		double medel = (ett + två + tre) / 3;
		return medel;

	}

	/**
	 * Denna metod tar in en mening och skriver sedan ut det med bara små bokstäver.
	 * STBSB = Stora bokstäver till Små Bokstäver
	 * 
	 * @param mening
	 * @return mening
	 */
	public static String SBTSB(String mening) {

		mening = mening.toLowerCase();
		return mening;

	}

	/**
	 * Denna metod tar in en mening och skriver sedan ut meningen med stora
	 * bokstäver och alla o blir utbytta med 0
	 * 
	 * @param mening2
	 * @return mening2
	 */
	public static String Programmering(String mening2) {

		mening2 = mening2.replace("o", "0").toUpperCase();
		return mening2;

	}

	/**
	 * Denna metod tar in sträcka och hastighet för att få ut tiden det tar att resa
	 * en sträcka med en hastighet
	 * 
	 * @param sträcka
	 * @param hastighet2
	 * @return tid
	 */
	public static double Time(double sträcka, double hastighet2) {

		double tid = sträcka / hastighet2;
		return tid;

	}

	/**
	 * Denna metod tar in arbete och sträcka för att få ut arbete
	 * 
	 * @param kraft
	 * @param sträcka2
	 * @return Arbete
	 */
	public static double Arbete(double kraft, double sträcka2) {

		double arbete = kraft * sträcka2;
		return arbete;

	}

	/**
	 * Denna metod tar in en hastighet uppåt för att få ut höjden den uppnår
	 * 
	 * @param velocity
	 * @return höjd
	 */
	public static double Höjd(double velocity) {

		double hastighet3 = velocity / 2;
		return hastighet3;

	}

	/**
	 * Denna metod tar in en volym för att få ut radien hos en sfär
	 * 
	 * @param volym
	 * @return radie
	 */
	public static double Volym(double volym) {
		double volym2 = Math.cbrt((3 * volym / (4 * 3.14)));
		return volym2;
	}

	/**
	 * Denna metoden tar in en bas och höjd för att få ut en area på en triangel
	 * 
	 * @param bas
	 * @param höjd2
	 * @return area
	 */
	public static double Triangel(double bas, double höjd2) {
		double volym3 = bas * höjd2 / 2;
		return volym3;
	}

	/**
	 * Denna metod tar in en mening och gör den hemsk genom att omnvandla alla u
	 * till uwu
	 * 
	 * @param A
	 * @return hemsk mening
	 */
	public static String Ok(String mening3) {

		String hemskt = mening3.replace("u", "uwu");
		return hemskt;

	}
}
