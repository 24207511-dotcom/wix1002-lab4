
import java.util.Random;

public class lab4q6 {

    public static void main(String[] args) {

        // 1. Generate a random integer
        Random rand = new Random();
        int randomNum = rand.nextInt(Integer.MAX_VALUE);

        // 2. Count the number of digits
        int digitCount = String.valueOf(randomNum).length();

        // 3. Display the results
        System.out.println("Generated number: " + randomNum);
        System.out.println("Number of digits: " + digitCount);
    }
}
