import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println((x > 0 && y > 0) ? 1 : (x < 0 && y < 0) ? 3 : (x > 0 && y < 0) ? 4 : 2);
    
    
	}

}
