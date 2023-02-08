package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal10_FindTheIndexOfTheSmallestElement {
    static final int SIZE = 10;

    public static void main(String[] args) {
        double[] number = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan " + SIZE + " nomor :" );
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextDouble();
        System.out.println("The index of the smallest number is :" + indexOfSmalleElement(number));
    }
    public static int indexOfSmalleElement(double[] array) {
        int index = 0;
        double low = array[index];
        for (int i = 0; i < array.length; i++) {
            if (low > array[i]) {
                low = array[i];
                index = i;
            }
        }
        return index;
    }
}
