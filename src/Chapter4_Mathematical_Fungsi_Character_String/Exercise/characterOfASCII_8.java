package Chapter4_Mathematical_Fungsi_Character_String.Exercise;

import java.util.Scanner;

public class characterOfASCII_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        System.out.println((char)i);
    }
}
