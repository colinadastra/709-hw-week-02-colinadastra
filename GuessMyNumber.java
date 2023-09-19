// Exercise 5.2

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100\n" +
        "(including both). Can you guess what it is?\n" +
        "Type a number: ");
        for (int i = 0; i < 3; i++) {
            int guess = in.nextInt();
            System.out.println("Your guess is: " + guess);
            if (guess == number) {
                System.out.println("Wow, you got it right!");
                in.close();
                return;
            }
            if (i >= 2) {
                System.out.println("Nope.");
                break;
            }
            if (guess < number) {
                System.out.print("Too low! Guess again: ");
            } else if (guess > number) {
                System.out.print("Too high! Guess again: ");
            }
        }
        System.out.println("Sorry, too many guesses. My number was " + number + ".");
        in.close();
    }
}
