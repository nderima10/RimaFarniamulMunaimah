package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal14_ComputingGcd {
    static final int SIZE = 10;

    public static void main(String[] args) {
        int[] number = new int[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan 19 nomor to get their gcd : ");
        for (int i = 0; i < number.length; i++)
            number[i] = (int) input.nextDouble();
        System.out.printf("The GCD is " + gcd(number));
    }
    public static int gcd(int...number) {
        int gcd = 1;
        int min = getMin(number);
        int length = number.length - 1;
        int count = 0;
        for (int i = 0; i <= min; i++) {
            for (int k = 0; k <= length; k++) {
                if (number[k] % i == 0) {
                    count++;
                    if (count == length) gcd = 1;
                }else
                    count= 0;
            }
        }
        return gcd;
    }
    public static int getMin ( int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
