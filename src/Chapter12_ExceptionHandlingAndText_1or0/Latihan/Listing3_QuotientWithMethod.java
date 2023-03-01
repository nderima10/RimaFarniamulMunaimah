package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

import java.util.Scanner;

public class Listing3_QuotientWithMethod {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero ");
            System.exit(1);
        }
        return number1 / number2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }
}
