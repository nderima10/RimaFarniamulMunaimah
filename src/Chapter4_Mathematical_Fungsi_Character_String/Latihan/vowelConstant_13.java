package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class vowelConstant_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (Character.isLetter(ch))
        {
            switch(Character.toUpperCase(ch))
            {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U': System.out.println(ch + " is a vowel"); break;
                default : System.out.println(ch + " is a consonant");
            }
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}
