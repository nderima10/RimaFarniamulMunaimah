package Chapter13_AbstractClassesAndInterfaces.Exercise;

import java.util.Scanner;

public class Soal1_DisplayImages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false) ?");
        boolean filled = input.hasNextBoolean();

        Soal1_13_Triangle triangle = new Soal1_13_Triangle(side1,side2,side3,color,filled);
        System.out.println(triangle);
    }
}
