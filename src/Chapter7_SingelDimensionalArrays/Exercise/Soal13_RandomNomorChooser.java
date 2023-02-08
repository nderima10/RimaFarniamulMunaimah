package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal13_RandomNomorChooser {
   static final int SIZE = 10;

    public static void main(String[] args) {
        int[] number = new int[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan " + SIZE + "angka untuk mengecualikan acak dari (1-54) : ");
        for (int i = 0; i < number.length; i++)
            number[i] = (int) input.nextDouble();
        System.out.printf("Number generated : " + getrandom(number));
    }
    public static int getrandom(int...number) {
        int random = (int) (Math.random() * 54 + 1);
        for (int i = 0; i < number.length; i++) {
            if (random == number[i]) {
                random = (int)(Math.random() * 54 + 1);
                i = -1;
            }
        }
        return random;

    }
}
