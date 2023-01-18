package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class financialApplication23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter emolooye's name : ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week : ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate : ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        double stateTaxRate = input.nextDouble();

        double grossPay, federal, state, totalDeduction;

        System.out.printf("Employee Name : " + name + "\nHours Worked : " +
                hoursWorked + "\nPayRate : $" + hourlyPayRate +
                "\nGrossPay : $" + (grossPay = hoursWorked * hourlyPayRate) +
                "\nDeduction :\n Federal Witholding (20.0%) : $" + (federal = grossPay * federalTaxRate) +
                "\nStateWitholding (9.0%): $" + (state = grossPay * stateTaxRate) +
                "\nTotalDeduction : $" + (totalDeduction = federal + state) +
                "\nNetPay : $" + (grossPay - totalDeduction));

    }
}
