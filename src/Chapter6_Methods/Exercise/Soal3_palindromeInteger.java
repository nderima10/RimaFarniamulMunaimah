package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal3_palindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        int angka = input.nextInt();
        System.out.println(angka + (isPalindrome(angka) ? " is " : " is not ") + " a palindrome.");
    }
    public static  boolean isPalindrome (int angka) {

        return angka == revers(angka);
    }
    public static int revers (int angka) {
        String reverse = " ";
        String n = angka + " ";
        for (int i = n.length() - 1; i > 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
