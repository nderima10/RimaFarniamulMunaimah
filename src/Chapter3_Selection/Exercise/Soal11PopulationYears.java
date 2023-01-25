package Chapter3_Selection.Exercise;

import java.util.Scanner;

public class Soal11PopulationYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();
        double population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);
        System.out.println("The population in " + years + " is " + population);
    }
}
