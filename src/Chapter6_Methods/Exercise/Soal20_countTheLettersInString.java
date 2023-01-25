package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal20_countTheLettersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan rangkaian: ");
        String rangkaian = input.nextLine();
        System.out.println("Jumlah huruf dalam rangkaian \"" + rangkaian +
                "\": " + countLetters(rangkaian));
    }
    public static int countLetters (String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))numberOfLetters++;
        }
        return numberOfLetters;
    }
}
