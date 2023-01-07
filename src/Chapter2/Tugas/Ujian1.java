package Chapter2.Tugas;

import java.util.Scanner;

public class Ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan alas segitiga: ");
        double as = input.nextDouble();
        System.out.print("Masukan tinggi segitiga: ");
        double ts = input.nextDouble();
        System.out.print("Masukan tinggi prisma: ");
        double tp = input.nextDouble();
        double z = as/2;
        double a = Math.pow(z, 2);
        double b = Math.pow(ts, 2);
        double c = a + b;
        double d = Math.pow(c, 0.5);
        double ks = (2 * d) + as;
        double lp = (2 * 0.5 * as * ts) + (ks * tp);

        System.out.println("Volume = " + 0.5 * as * ts * tp);
        System.out.println("Luas permukaan = " + lp);
    }
}
