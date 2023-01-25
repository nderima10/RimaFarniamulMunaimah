package Chapter6_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MengurutkanAngka1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah angka: ");
        int angka = input.nextInt();
        int[] array = new int[angka];
        System.out.print("Masukan angka yang akan diurutkan: ");
        int i;
        for (i = 0; i < angka; i++) {
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        for (int index : array) {
            System.out.println("urutan dari terkecil: " + index);
        }
    }
}



