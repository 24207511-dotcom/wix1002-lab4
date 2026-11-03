
import java.util.Scanner;

public class lab4q7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 1. Get input from user
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double annualRate = sc.nextDouble();

            System.out.print("Enter total number of months: ");
            int months = sc.nextInt();

            // 2. Validate input
            if (principal <= 0 || annualRate < 0 || months <= 0) {
                System.out.println("Invalid input.");
                return;
            }

            // 3. Calculate monthly interest rate
            double monthlyRate = annualRate / 1200.0;

            // 4. Calculate monthly payment
            double monthlyPayment;

            if (monthlyRate == 0) {
                monthlyPayment = principal / months;
            } else {
                monthlyPayment = principal * monthlyRate
                        / (1 - Math.pow(1 + monthlyRate, -months));
            }

            // 5. Initialize loan balance
            double balance = principal;
            double totalInterest = 0;

            // 6. Display table heading
            System.out.printf("%-7s %16s %16s %14s %18s %18s%n",
                    "Month", "Monthly Payment", "Principal",
                    "Interest", "Unpaid Balance", "Total Interest");

            // 7. Calculate repayment for each month
            for (int month = 1; month <= months; month++) {

                double interest = balance * monthlyRate;
                double principalPaid = monthlyPayment - interest;
                double payment = monthlyPayment;

                // Adjust the final payment
                if (month == months) {
                    principalPaid = balance;
                    payment = principalPaid + interest;
                }

                balance -= principalPaid;
                totalInterest += interest;

                // 8. Display monthly repayment details
                System.out.printf(
                        "%-7d %16.2f %16.2f %14.2f %18.2f %18.2f%n",
                        month, payment, principalPaid,
                        interest, balance, totalInterest);
            }
        }
    }
}
