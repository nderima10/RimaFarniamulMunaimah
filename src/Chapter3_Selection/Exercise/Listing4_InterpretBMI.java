package Chapter3_Selection.Exercise;

import java.util.Scanner;

public class Listing4_InterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berat badan: ");
        double berat = input.nextDouble();
        System.out.print("Masukan tinggi badan: ");
        double tinggi = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.02554;

        double beratInKilograms = berat * KILOGRAMS_PER_POUND;
        double tinggiInMeters = tinggi * METERS_PER_INCH;
        double bmi = beratInKilograms / (tinggiInMeters * tinggiInMeters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
            System.out.println("Kurus");
        }else if (bmi < 25){
            System.out.println("Normal");
        } else if (bmi < 30){
            System.out.println("over berat");
        }else {
            System.out.println("obesitas");
        }
    }
}
