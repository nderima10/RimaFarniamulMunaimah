package Chapter4.Latihan;

import java.util.Scanner;

public class uniCode9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.println("Enter unicode for the character " + s + " is " + (int)ch);
    }
}
