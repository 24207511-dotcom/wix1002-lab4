
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class lab4q8 {

    public static void main(String[] args) {

        // 1. Generate a random number between 5 and 30
        Random random = new Random();
        int n = random.nextInt(26) + 5;

        System.out.println("First " + n + " prime number(s):");

        String format = "%-25s : %s%n";

        // 2. Find prime numbers using a for loop
        int[] forPrimes = new int[n];
        int count = 0;

        for (int num = 2; count < n; num++) {
            if (isPrime(num)) {
                forPrimes[count] = num;
                count++;
            }
        }

        System.out.printf(format, "For loop",
                Arrays.toString(forPrimes));

        // 3. Find prime numbers using a while loop
        int[] whilePrimes = new int[n];
        count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                whilePrimes[count] = num;
                count++;
            }
            num++;
        }

        System.out.printf(format, "While loop",
                Arrays.toString(whilePrimes));

        // 4. Find prime numbers using the first method
        System.out.printf(format, "getFirstNPrimeNumbers",
                getFirstNPrimeNumbers(n));

        // 5. Find prime numbers using the second method
        System.out.printf(format, "getFirstNPrimeNumbers2",
                getFirstNPrimeNumbers2(n));
    }

    // 6. Check whether a number is prime
    private static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 7. Generate prime numbers using the first method
    private static List<Integer> getFirstNPrimeNumbers(int n) {

        List<Integer> primes = new ArrayList<>();

        int num = 2;

        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }

    // 8. Generate prime numbers using the second method
    private static List<Integer> getFirstNPrimeNumbers2(int n) {

        List<Integer> primes = new ArrayList<>();

        if (n <= 0) {
            return primes;
        }

        primes.add(2);

        int num = 3;

        while (primes.size() < n) {

            boolean prime = true;

            for (int p : primes) {
                if (p * p > num) {
                    break;
                }

                if (num % p == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes.add(num);
            }

            num += 2;
        }

        return primes;
    }
}
