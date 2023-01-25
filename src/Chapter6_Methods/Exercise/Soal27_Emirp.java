package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal27_Emirp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        int  number = input.nextInt();
        System.out.println(number + (isPalindrom(number) ? " is " : " is not ") + "a palindrom.");
    }
    public static boolean isPalindrom(int number) {
        return number == reverse(number) ? true : false;
    }
    public static  int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
