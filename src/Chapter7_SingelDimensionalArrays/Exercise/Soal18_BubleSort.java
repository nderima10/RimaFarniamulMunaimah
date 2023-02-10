package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal18_BubleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];

        System.out.print("Masukan 10 nomor : ");
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextDouble();

            bubbleSort(number);
            for (double e: number) {
                System.out.print(e + " ");
            }
            System.out.println();
    }
    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
