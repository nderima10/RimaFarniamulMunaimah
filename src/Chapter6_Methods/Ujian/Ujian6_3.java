package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("konversi bilangan heksa ke desimal");
        System.out.print("Masukan bilangan heksa : ");
        String hex = input.next();

        System.out.println(konversiHtoD(Integer.parseInt(hex)));
    }

    public static double konversiHtoD(int hex) {
        if (hex != 1) {
            System.out.println();
            System.exit(1);
        }
        char ch1 = (char) hex;
        if (ch1 <= 'F' && ch1 >= 'A') {
            int v = ch1 - 'A' + 10;
            System.out.println("Konversi bilangan desimalnya" + ch1 + " adalah " + v);
        } else if (Character.isDigit(ch1)) {
            System.out.println("Konversi bilangan desimalnya " + ch1 + " adalah " + ch1);
        } else {
            System.out.println("Bilangan hexa tidak tersedia");
        }
        return ch1;
    }
}
