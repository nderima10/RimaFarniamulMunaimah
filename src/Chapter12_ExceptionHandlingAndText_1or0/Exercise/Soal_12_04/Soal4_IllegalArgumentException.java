package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_04;

import java.util.Scanner;

public class Soal4_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            System.out.print("Enter annual interest rate, for example, 8.25: ");
            double annualInterestRate = input.nextDouble();

            System.out.print("Enter number of years as an integer: ");
            int numberOfYears = input.nextInt();

            System.out.print("Enter loan amount, for example, 120000.95: ");
            double loanAmount = input.nextDouble();

            try {
                Soal4b_Loan loan = new Soal4b_Loan(annualInterestRate,numberOfYears,loanAmount);
                continueInput = false;

                System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nTne total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        while (continueInput);
    }
}
