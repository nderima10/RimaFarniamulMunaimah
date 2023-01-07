package Chapter5.Latihan;

import java.util.Scanner;

public class FaktorBilanganBulat5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int number = input.nextInt();
        int index = 2;

        while (number / index != 1) {
            if (number % index == 0) {
                System.out.print(index + " ");
                number /= index;
            }
            else
                index++;
        }
        System.out.println(number + ".");
    }
}
