
import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(n % 2 == 0 ? "Bob" : "Alice"); // ? Fungerar som en if sats, det första som kommer efter ? = True 
                                                          // Och det som kommer efter : = False
    }
}
