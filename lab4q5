
import java.util.Scanner;

public class lab4q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input from user
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        // 2. Find and display the factors
        System.out.print("The factors are: ");

        boolean firstFactor = true;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                if (!firstFactor) {
                    System.out.print(", ");
                }

                System.out.print(i);
                firstFactor = false;
            }
        }

        System.out.println();
        scanner.close();
    }
}
