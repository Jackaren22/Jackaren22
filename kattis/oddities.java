import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        
        while (cases --> 0) {
        	
            int num = input.nextInt();
            
            System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd"); 
        }
    }
}