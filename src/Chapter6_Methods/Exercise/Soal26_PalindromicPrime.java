package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal26_PalindromicPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan: ");
        int nomor = input.nextInt();
        System.out.println(nomor + (isPalindrom(nomor) ? " is " : " is not " + "a palindrom."));
    }
    public static boolean isPalindrom(int nomor) {
        return nomor == reverse (nomor) ? true : false;
    }
    public static int reverse(int nomor) {
        String reverse = "";
        String n = nomor + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
