package Chapter3.Latihan;

import java.util.Scanner;

public class Soal10Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + String.format("%.2f",energy) );
    }
}
