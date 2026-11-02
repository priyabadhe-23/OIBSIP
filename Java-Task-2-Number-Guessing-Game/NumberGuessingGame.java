import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int score = 0;
        char play;

        do {
            int number = r.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("\nGuess the number between 1 and 100");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number)
                    System.out.println("Too High!");
                else if (guess < number)
                    System.out.println("Too Low!");
                else
                    System.out.println("Correct! Attempts: " + attempts);

            } while (guess != number);

            score += Math.max(0, 100 - attempts);

            System.out.println("Your Score: " + score);
            System.out.print("Play again? (y/n): ");
            play = sc.next().charAt(0);

        } while (play == 'y' || play == 'Y');

        System.out.println("Final Score: " + score);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}
