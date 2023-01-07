package Chapter3.Latihan;

import java.util.Scanner;

public class Soal3FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        final double MetersPerFoot = 0.305 ;
        System.out.println("Enter value for free: ") ;
        double feet = input.nextDouble() ;
        double meters = feet * MetersPerFoot ;
        System.out.println("Feet " + feet + " is " + meters + " meters ") ;
    }
}
