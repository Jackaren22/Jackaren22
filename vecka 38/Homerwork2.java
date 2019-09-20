import java.util.Scanner;

public class Homerwork2 {

	public static void main(String[] args) {
		
		int tal1 = 0;
		int tal2 = 0;
		int tal3 = 0; 
		int tal4 = 0;
		int tal5 = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose 5 numbers fool");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		tal3 = input.nextInt();
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		
		double mid = (tal1+tal2+tal3+tal4+tal5); //Median Värdet
		double mid2 = (mid)/5;
		
		
		
		if (tal1 >=tal2 && tal1 >=tal3 && tal1 >=tal4 && tal1 >=tal5)  {
		System.out.println("Highest Number:"+tal1);
		}
		else if (tal2 >=tal1 && tal2 >=tal3 && tal2 >=tal4 && tal2 >=tal5) {
		System.out.println("Highest Number"+tal2);
		}
		else if (tal3 >=tal1 && tal3 >=tal2 && tal3 >=tal4 && tal3 >=tal5) {
			System.out.println("Highest Number"+tal3);
			}
		else if (tal4 >=tal1 && tal4 >=tal3 && tal4 >=tal2 && tal4 >=tal5) {
			System.out.println("Highest Number"+tal4);
			}
		else if (tal5 >=tal1 && tal5 >=tal3 && tal5 >=tal4 && tal5 >=tal4) {
			System.out.println("Highest Number"+tal5);
			}
		if (tal1 <=tal2 && tal1 <=tal3 && tal1 <=tal4 && tal1 <=tal5)  {
			System.out.println("Lowest Number:"+tal1);
			}
			else if (tal2 <=tal1 && tal2 <=tal3 && tal2 <=tal4 && tal2 <=tal5) {
			System.out.println("Lowest Number"+tal2);
			}
			else if (tal3 <=tal1 && tal3 <=tal2 && tal3 <=tal4 && tal3 <=tal5) {
				System.out.println("Lowest Number"+tal3);
				}
			else if (tal4 <=tal1 && tal4 <=tal3 && tal4 <=tal2 && tal4 <=tal5) {
				System.out.println("Lowest Number"+tal4);
				}
			else if (tal5 <=tal1 && tal5 <=tal3 && tal5 <=tal4 && tal5 <=tal4) {
				System.out.println("Lowest Number"+tal5);
				}
		
		System.out.println("Average Number:" + mid2);
		

	}

}
