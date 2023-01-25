package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal21_PhoneKeypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukantangkaian: ");
        String rangkaian = input.nextLine();
        for (int i = 0; i < rangkaian.length(); i++) {
            if (Character.isLetter(rangkaian.charAt(i)))
                System.out.println(getNumber(Character.toUpperCase(rangkaian.charAt(i))));
            else
                System.out.print(rangkaian.charAt(i));
        }
        System.out.println();
    }
    public static int getNumber (char upperCaseLetter) {
        if (upperCaseLetter >= 'W')
            return 9;
        else if (upperCaseLetter >= 'T')
            return 8;
        else if (upperCaseLetter >= 'P')
            return 7;
        else if (upperCaseLetter >= 'M')
            return 6;
        else if (upperCaseLetter >= 'J')
            return 5;
        else if (upperCaseLetter >= 'G')
            return 4;
        else if (upperCaseLetter >= 'D')
            return 3;
            else
                return 2;
    }
}
