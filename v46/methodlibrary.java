import java.util.Scanner;

public class methodlibrary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in en mening som ineh�ller bokstaven u minst en g�ng");
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

		System.out.println("Skriv in massa och sedan hastighet f�r att f� ut kinetisk energi");
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		System.out.println(Kinetisk(massa, hastighet));

		System.out.println("Skriv in massa och sedan h�jd f�r att f� ut potensial energi");
		double massa2 = input.nextDouble();
		double h�jd = input.nextDouble();
		System.out.println(Potensial(massa2, h�jd));

		System.out.println("Skriv in 3 olika tal och f� ut medelv�rdet");
		double ett = input.nextDouble();
		double tv� = input.nextDouble();
		double tre = input.nextDouble();
		System.out.println(Medel(ett, tv�, tre));

		String mening = "PaParaZZi";
		System.out.println(SBTSB(mening));

		String mening2 = "Jag vill bli godk�nd i programmering! <3";
		System.out.println(Programmering(mening2));

		System.out.println("Skriv in str�cka och hastighet och f� ut tids enheten det tar");
		double str�cka = input.nextDouble();
		double hastighet2 = input.nextDouble();
		System.out.println(Time(str�cka, hastighet2));

		System.out.println("Skriv in kraft och str�cka och f� ut arbete");
		double kraft = input.nextDouble();
		double str�cka2 = input.nextDouble();
		System.out.println(Arbete(kraft, str�cka2));

		System.out.println("Skriv in hastighet f�r att f� ut hur h�gt ett f�rem�l som kommer upp�t �ker");
		double hastighet3 = input.nextDouble();
		System.out.println(H�jd(hastighet3));

		System.out.println("Skriv in volym av en sf�r och f� ut radie");
		double volym = input.nextDouble();
		System.out.println(Volym(volym));

		System.out.println("Skriv in en bas och en h�jd f�r att r�kna ut en triangels area");
		double bas = input.nextDouble();
		double h�jd2 = input.nextDouble();
		System.out.println(Triangel(bas, h�jd2));

	}

	/**
	 * Denna metod tar in ett tal som ska representera fahrenheit och sen s�
	 * omnvadlar metoden fahrenheit v�rdet till kelvin. Det jag har inne i koden �r
	 * d� omvandlingen till kelvin fr�n fahrenheit
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
	 * Denna metod �r exakt lika dan som den tidigare metod bara att denna omvandlar
	 * Kelvin till celcius ist�llet
	 * 
	 * @param kelvin
	 * @return Celcius
	 */
	public static double KTC(double kelvin) { // KTC = Kelvin to Celcius

		double celcius = kelvin - 273.15;
		return celcius;

	}

	/**
	 * Denna metod �r ocks� en omvandlare men den omvandlar ist�llet km/h till m/s
	 * 
	 * @param km
	 * @return m/s
	 */
	public static double KMTM(double km) { // KMTM = km/h to m/s

		double m = km / 3.6;
		return m;

	}

	/**
	 * Denna metod tar in en massa och hastighet och multiplicerar den f�r att f� ut
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
	 * Denna metod tar in massa och h�jd och multiplicerar de v�rderna med varandra
	 * f�r och sen multipliceras det v�rdet med gravitation f�r att f� ut potensial
	 * energi
	 * 
	 * @param massa2
	 * @param h�jd
	 * @return potensial energi
	 */
	public static double Potensial(double massa2, double h�jd) {

		double potensial = massa2 * h�jd * 9.82;
		return potensial;

	}

	/**
	 * Denna metod tar in 3 olika tal och tar sedan fram medelv�rdet
	 * 
	 * @param ett
	 * @param tv�
	 * @param tre
	 * @return Medelv�rdet
	 */
	public static double Medel(double ett, double tv�, double tre) {

		double medel = (ett + tv� + tre) / 3;
		return medel;

	}

	/**
	 * Denna metod tar in en mening och skriver sedan ut det med bara sm� bokst�ver.
	 * STBSB = Stora bokst�ver till Sm� Bokst�ver
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
	 * bokst�ver och alla o blir utbytta med 0
	 * 
	 * @param mening2
	 * @return mening2
	 */
	public static String Programmering(String mening2) {

		mening2 = mening2.replace("o", "0").toUpperCase();
		return mening2;

	}

	/**
	 * Denna metod tar in str�cka och hastighet f�r att f� ut tiden det tar att resa
	 * en str�cka med en hastighet
	 * 
	 * @param str�cka
	 * @param hastighet2
	 * @return tid
	 */
	public static double Time(double str�cka, double hastighet2) {

		double tid = str�cka / hastighet2;
		return tid;

	}

	/**
	 * Denna metod tar in arbete och str�cka f�r att f� ut arbete
	 * 
	 * @param kraft
	 * @param str�cka2
	 * @return Arbete
	 */
	public static double Arbete(double kraft, double str�cka2) {

		double arbete = kraft * str�cka2;
		return arbete;

	}

	/**
	 * Denna metod tar in en hastighet upp�t f�r att f� ut h�jden den uppn�r
	 * 
	 * @param velocity
	 * @return h�jd
	 */
	public static double H�jd(double velocity) {

		double hastighet3 = velocity / 2;
		return hastighet3;

	}

	/**
	 * Denna metod tar in en volym f�r att f� ut radien hos en sf�r
	 * 
	 * @param volym
	 * @return radie
	 */
	public static double Volym(double volym) {
		double volym2 = Math.cbrt((3 * volym / (4 * 3.14)));
		return volym2;
	}

	/**
	 * Denna metoden tar in en bas och h�jd f�r att f� ut en area p� en triangel
	 * 
	 * @param bas
	 * @param h�jd2
	 * @return area
	 */
	public static double Triangel(double bas, double h�jd2) {
		double volym3 = bas * h�jd2 / 2;
		return volym3;
	}

	/**
	 * Denna metod tar in en mening och g�r den hemsk genom att omnvandla alla u
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
