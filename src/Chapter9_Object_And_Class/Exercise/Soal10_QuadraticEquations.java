package Chapter9_Object_And_Class.Exercise;

import java.util.Scanner;

public class Soal10_QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Soal10b quadratEquatio = new Soal10b(a,b,c);

        System.out.println("The equation has ");
        if (quadratEquatio.getDiscriminant() < 0)
            System.out.println("No real roots");
        else if (quadratEquatio.getDiscriminant() > 0) {
            System.out.println("two roots " + quadratEquatio.getRoot1() + " And " + quadratEquatio.getRoot2());
        }
        else
            System.out.println("One root " + (quadratEquatio.getRoot1() > 0 ? quadratEquatio.getRoot1() : quadratEquatio.getRoot2()));
    }
}
