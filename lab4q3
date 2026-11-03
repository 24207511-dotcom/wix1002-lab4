
import java.util.Scanner;

public class lab4q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input and variable initialization
        int count = 0;
        int sum = 0;
        int sumSquares = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 2. Read scores from the user
        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            }

            count++;
            sum += score;
            sumSquares += score * score;

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }
        }

        // 3. Calculate and display results
        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);

            if (count > 1) {
                double variance =
                        (sumSquares - (Math.pow(sum, 2) / count))
                        / (count - 1);

                double standardDeviation = Math.sqrt(variance);

                System.out.printf("Variance: %.2f%n", variance);
                System.out.printf("Standard Deviation: %.2f%n",
                        standardDeviation);
            } else {
                System.out.println("Variance: N/A");
                System.out.println("Standard Deviation: N/A");
            }
        } else {
            System.out.println("No valid scores entered.");
        }

        scanner.close();
    }
}
