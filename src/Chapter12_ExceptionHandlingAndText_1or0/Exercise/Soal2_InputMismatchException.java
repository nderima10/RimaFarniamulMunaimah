package Chapter12_ExceptionHandlingAndText_1or0.Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal2_InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean  continueInput = true;

        System.out.print("Enter two numbers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                System.out.println("the sum is " +  (number1 + number2));
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: two integers are required)");
                input.nextLine();
            }
        }
        while (continueInput);
    }
}
