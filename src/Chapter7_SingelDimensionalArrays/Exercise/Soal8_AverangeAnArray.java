package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal8_AverangeAnArray {
    static final int SIZE = 10;

    public static void main(String[] args) {
        double[] numbers = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 10 kali nomor : ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
            System.out.println("The average value is : " + average(numbers));
    }
    public static  int average (int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
    public static double average (double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
    public static void  printArray (int[] array, int numberPerLine) {
        for (int i = 0; i< array.length; i++) {
            System.out.printf("%", array[i]);
            if ((i + 1) % numberPerLine == 0)
                System.out.println(" ");
        }
    }
}
