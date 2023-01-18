package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class chekSSN21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a SSN : ");
        String ssn = input.nextLine();
        boolean isValid = (ssn.length() == 11) &&
                (Character.isDigit(ssn.charAt(0)))
                &&
                (Character.isDigit(ssn.charAt(1)))
                &&
                (ssn.charAt(3) == '-') &&
                (Character.isDigit(ssn.charAt(4)))
                &&
                (Character.isDigit(ssn.charAt(5)))
                &&
                (Character.isDigit(ssn.charAt(7)))
                &&
                (Character.isDigit(ssn.charAt(8)))
                &&
                (Character.isDigit(ssn.charAt(9)))
                &&
                (Character.isDigit(ssn.charAt(10)));

        System.out.println(ssn + " is " + ((isValid) ? "a valid " : " an valid") + "sosial security number");

    }
}
