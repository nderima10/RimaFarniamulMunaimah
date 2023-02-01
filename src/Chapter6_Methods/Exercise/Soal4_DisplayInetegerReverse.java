package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal4_DisplayInetegerReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tampilkan bilangan bulat terbalik ");
        System.out.print("masukan angka: ");
        int nomor = input.nextInt();

        reverse (nomor);
    }
    public static void reverse(int nomor){
        while (nomor > 0) {
            System.out.print((nomor % 10));
            nomor /= 10;
        }
        System.out.println();
    }
}
