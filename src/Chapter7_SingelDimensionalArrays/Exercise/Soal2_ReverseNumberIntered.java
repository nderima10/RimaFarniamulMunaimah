package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal2_ReverseNumberIntered {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan 10 bilanngan : ");
        int[] n = new int [10];

        for (int i = 0; i < 10; i++)
            n[i] = input.nextInt();
        for (int i = n.length - 1; i >= 0; i--)
            System.out.print(n[i] + " ");
    }
}
