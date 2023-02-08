package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal12_ReverseAnArray {
    static final int SIZE= 10;

    public static void main(String[] args) {
        double[] array = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan " + SIZE + " nomor : ");
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();
        double[] reverse = reverse(array);
        System.out.println("The array in reverse : ");
        prntArray(reverse, 10);
    }
    public static double[] reverse(double[] original) {
        double[] reverse = new double[original.length];
        int endIndex = original.length - 1;
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = original[endIndex--];
        }
        return reverse;
    }
    public static void prntArray(double[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4.2f ", array[i]);
            if ((i + 1) % numberPerLine == 0)
                System.out.print(" ");
        }
    }
}
