package Chapter5_Loops.Exerrcise;

import java.util.Scanner;

public class Listing3_GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("guess a magi number betweeen 0 and 100");

        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your guess :");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " +  number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("your guess is too low");

        }
    }
}
