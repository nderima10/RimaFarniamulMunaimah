package Chapter9_Object_And_Class.Exercise;

import java.util.Scanner;

public class Soal13_Location {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array: ");
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        Soal13b max = locationLarges(array);

        System.out.println("The location of the largest element is " + max.maxValue + " at (" + max.row + ", " + max.column + ")");
    }
    public static Soal13b locationLarges(double[][] a) {
        return new Soal13b(a);
    }
}
