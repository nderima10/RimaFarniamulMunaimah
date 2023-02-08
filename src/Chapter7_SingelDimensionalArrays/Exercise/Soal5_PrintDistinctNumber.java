package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal5_PrintDistinctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] no = new int[10];
        int index = 0;
        System.out.print("Masukan 10 nomor : ");

        for (int i = 0; i < no.length; i++) {
            int nom = input.nextInt();
            if (isNew(no, nom)) {
                no[index++] = nom;
            }
        }
        System.out.println("Jumlah jarak nomor adalah " + index);
        System.out.println("Nomor yang berbeda adalah : ");
        for (int i = 0; i < index; i++) {
            System.out.print(no[i] + " ");
        }
    }
    public static boolean isNew (int[] no, int n) {
        for (int i : no) {
            if (n == i)
                return false;
        }
        return true;
    }
}
