package Chapter5_Loops.Exercise;

import java.util.Scanner;

public class compareLoansWithVariousInterestTates5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Ammount : ");
        double LoanAmmount = input.nextDouble();
        System.out.print("Number of Years : ");
        int numberOfYears = input.nextInt();

        System.out.println("interest rate   Monthly payment    Total Payment");
        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%         ");
            double monthlyInterestRate = i / 1200;
            double MonthlyPayment = LoanAmmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-19.2f", MonthlyPayment);
            System.out.printf("%-8.2f\n",(MonthlyPayment * 12) * numberOfYears);
        }
    }
}
