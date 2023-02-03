package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mengkonversi bilangan Biner ");
        System.out.println("=============== Menu ===============\n");
        System.out.println("1. Konversi bilangan biner ke oktal");
        System.out.println("2. Konversi bilangan biner ke desimal");
        System.out.println("3. Konversi bilangan biner ke heksa");
        System.out.println("4. Konversi bilangan oktal ke biner");
        System.out.println("5. Konversi bilangan oktal ke desimal");
        System.out.println("6. Konversi bilangan oktal ke heksa");
        System.out.println("7. Konversi bilangan desimal ke biner");
        System.out.println("8. Konversi bilangan desimal ke oktal");
        System.out.println("9. Konversi bilangan desimal ke heksa");
        System.out.println("10. Konversi bilangan heksa ke biner");
        System.out.println("11. Konversi bilangan heksa ke oktal");
        System.out.println("12. Konversi bilangan heksa ke desimal");

        System.out.print("Masukan nomor MENU : ");
        int MENU = input.nextInt();
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
