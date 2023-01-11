package Chapter5.Latihan;

import java.util.Scanner;

public class loanAmortizationSchedule5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Ammount: ");
        double loanAmmount = input.nextDouble();
        System.out.print("Number of years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest rate: ");
        double annualRate = input.nextDouble();

        double monthlyrate = annualRate / 1200;
        double monthlyPayment = loanAmmount * monthlyrate / (1 - 1 / Math.pow(1 + monthlyrate, years * 12));

        System.out.printf("monthlly payment : %.2f\n", monthlyPayment);
        System.out.printf("Total payment: %.2f\n", (monthlyPayment * 12) * years);
        double balance = loanAmmount, principal, interest;
        System.out.println("paymen#     interest    principal   balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyrate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
        }
    }
}
