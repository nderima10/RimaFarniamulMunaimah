package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal35_AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
