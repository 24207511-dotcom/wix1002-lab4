
import java.util.Random;

public class lab4t5 {

    public static void main(String[] args) {

        // 1. Initialize player scores
        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1;

        Random random = new Random();

        // 2. Continue until a player scores more than 100
        while (player1Score <= 100 && player2Score <= 100) {

            // Generate a random dice number from 1 to 6
            int dice = random.nextInt(6) + 1;

            // 3. Add points to the current player
            if (currentPlayer == 1) {
                player1Score += dice;
            } else {
                player2Score += dice;
            }

            // 4. Display the dice result
            System.out.printf(
                    "Player %d rolls the dice and gets %d points.%n",
                    currentPlayer, dice);

            // 5. Check whether a player has won
            if (player1Score > 100 || player2Score > 100) {
                break;
            }

            // 6. Switch players unless the dice shows 6
            if (dice != 6) {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

        // 7. Display the winner
        if (player1Score > 100) {
            System.out.printf(
                    "Player 1 wins with %d points!%n",
                    player1Score);
        } else {
            System.out.printf(
                    "Player 2 wins with %d points!%n",
                    player2Score);
        }
    }
}
