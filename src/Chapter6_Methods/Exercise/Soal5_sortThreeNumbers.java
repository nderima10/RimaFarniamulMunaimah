package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal5_sortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tiga nomor: ");
        double nomor1 = input.nextDouble();
        double nomor2 = input.nextDouble();
        double nomor3 = input.nextDouble();

        displaySortedNumbers(nomor1, nomor2, nomor3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
