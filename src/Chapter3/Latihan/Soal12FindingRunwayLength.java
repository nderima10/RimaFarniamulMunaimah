package Chapter3.Latihan;

import java.util.Scanner;

public class Soal12FindingRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed anad acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed * speed) / (2 * acceleration);
        System.out.println("The minimum runaway length for this airplane is " + String.format("%.2f",length) );
    }
}
