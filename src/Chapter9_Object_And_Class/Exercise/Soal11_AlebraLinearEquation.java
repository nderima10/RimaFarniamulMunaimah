package Chapter9_Object_And_Class.Exercise;

import java.util.Scanner;

public class Soal11_AlebraLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a,b,c,d,e,f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        Soal11b linearEquation = new Soal11b(a,b,c,d,e,f);

        if (linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() + "and y is " + linearEquation.getY());
        }
        else

            System.out.println("The equation has no solution. ");
    }
}
