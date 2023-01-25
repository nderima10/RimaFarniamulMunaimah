package Chapter6_Methods.Latihan;

import java.util.Scanner;

public class Listing8_Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan hex : ");
        String hex = input.nextLine();
        System.out.println("Bilangan des ke hex adalah " + hex + " is " + hexToDes(hex.toUpperCase()));
    }
    public static int hexToDes(String hex) {

        int desvalue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar =  hex.charAt(i);
            desvalue = desvalue * 16 + hexCharToDes(hexChar);
        }
        return  desvalue;
    }
    public static int hexCharToDes (char ch) {
        if (ch >= 'A' && ch <= 'F')
            return  10 + ch - 'A';
        else
            return  ch - '0';
    }
}
