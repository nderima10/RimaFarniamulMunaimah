package Chapter5_Loops.Exercise;

import java.util.Scanner;

public class PersekutuanTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai pertama : ");
        int n1 = input.nextInt();
        System.out.print("Masukan nilai waktu : ");
        int n2 = input.nextInt();

        int gcd = n1 < n2 ? n1 : n2;

        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd++;
        }
        System.out.println("Pembagi persekutuan terbesar untuk " + n1 + " dan " + n2 + " adalah " + gcd);
    }
}
