package Chapter5_Loops.Latihan;

import java.util.Scanner;

public class Listing11_Dec2Hex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is" + hex);

    }
}