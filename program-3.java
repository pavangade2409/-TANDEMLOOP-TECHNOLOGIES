import java.util.Scanner;

public class SeriesGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer (a): ");
        int a = scanner.nextInt();

    
        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Output: ");
        int limit = (a % 2 == 0) ? a - 1 : a; 
        for (int i = 0; i < limit; i++) {
            int number = 2 * i + 1; 
            System.out.print(number);
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }
    }
}
