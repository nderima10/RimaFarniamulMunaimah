package Chapter4.Latihan;

import java.util.Scanner;

public class prosessString20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("enter a string : ");
        String str = input.nextLine();
        System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
    }
}