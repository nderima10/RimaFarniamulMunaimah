package Chapter5.Latihan;

import java.util.Scanner;

public class bitLevelOperations5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan bulat: ");
        short number = input.nextShort();

        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>=1;
        }
        System.out.println("bit adalah " + bits);
    }
}
