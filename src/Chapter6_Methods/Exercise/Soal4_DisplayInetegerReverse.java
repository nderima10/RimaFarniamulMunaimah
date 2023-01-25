package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal4_DisplayInetegerReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Display and integer rreversed ");
        System.out.print("masukan angka: ");
        int angka = input.nextInt();

        reverse (angka);
    }
    public static void reverse(int nomor){
        while (nomor > 0) {
            System.out.print((nomor % 10));
        }
        System.out.println();
    }
}
