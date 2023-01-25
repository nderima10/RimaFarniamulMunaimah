package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal19_MyTriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tiga sisi untuk segitiga: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println(isValid(side1, side2, side3) ?
                "Luas segitiga tersebut adalah " + area(side1, side2, side3) :
                "Masukan tidak valid");
    }
    public static boolean isValid (double side1, double side2, double side3) {
        boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        return valid;
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
