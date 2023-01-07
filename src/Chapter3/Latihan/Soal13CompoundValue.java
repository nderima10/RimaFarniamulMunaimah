package Chapter3.Latihan;

import java.util.Scanner;

public class Soal13CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MONTHLY_INTEREST_RATE = 0.00417;
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double total = 100 * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is " + String.format("%.2f",total) );
    }
}
