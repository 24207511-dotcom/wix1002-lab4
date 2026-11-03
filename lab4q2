
import java.util.Scanner;

public class t4q2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 1. Get input from user
            System.out.print("Enter an integer n: ");
            int n = sc.nextInt();

            // 2. Initialize variables
            int totalSum = 0;
            int currentTermSum = 0;

            // 3. Calculate the sum of the series
            for (int i = 1; i <= n; i++) {
                currentTermSum += i;
                totalSum += currentTermSum;
            }

            // 4. Display the result
            System.out.println("The sum of the series is: " + totalSum);
        }
    }
}
