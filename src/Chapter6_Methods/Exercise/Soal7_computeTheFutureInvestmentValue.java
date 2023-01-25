package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal7_computeTheFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner inpur = new Scanner(System.in);
        final int NUMBER_OF_YEARS = 30;

        System.out.print("\nThe amount invested: ");
        double ammunt = inpur.nextDouble();
        System.out.println("Annual interes rate: ");
        double interest = inpur.nextDouble();

        double monthlyInterestrate = interest / 1200;
        System.out.println("years   Future value");
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n", futureInvestmentValiue(ammunt, monthlyInterestrate, years));
        }
    }
    public static double futureInvestmentValiue (
            double investmentAmount, double monthlyInterestrate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestrate, years * 12);
    }
}
