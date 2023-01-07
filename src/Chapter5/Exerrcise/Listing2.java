package Chapter5.Exerrcise;

import java.util.Scanner;

public class Listing2 {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("guse a magic number betweeen 0 and 100");

        System.out.print("\nEnter you guess : ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("yes, the number is " + number);
        else if (guess > number)
            System.out.println("your guess is too high");
        else
            System.out.println("your guess is too low");
    }
}
