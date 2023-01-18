package Chapter5_Loops.Latihan;

import java.util.Scanner;

public class terjadinyaAngkaMax5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nomor: ");
        int max = input.nextInt();
        int count = 0;
        int number = 1;

        while (number > 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
                count = 0;
            }
            if (number == max)
                count++;
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
