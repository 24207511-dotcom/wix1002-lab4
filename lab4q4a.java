
import java.util.Scanner;

public class lab4q4a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input from user
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        // 2. Find and display the factors
        System.out.print("The factors are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i);

                if (i < num) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}
