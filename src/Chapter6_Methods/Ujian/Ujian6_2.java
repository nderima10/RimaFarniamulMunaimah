package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Menu Banun Ruang: ");
        int MENU = input.nextInt();
        System.out.println("--------------------------");
        switch (MENU) {
            case 1 -> {
                System.out.print("rusuk kubus: ");
                int rusuk = input.nextInt();
                System.out.println(kubus(rusuk));
            }
            case 2 -> {
                System.out.println("Menu volume balok");
                System.out.print("panjang : ");
                int P = input.nextInt();
                System.out.print("Lebar : ");
                int L = input.nextInt();
                System.out.print("Tinggi : ");
                int T = input.nextInt();
                System.out.println(balok(P, L, T));
            }
            case 3 -> {
                System.out.println("Menu volume Limas\n");
                System.out.print("Tinggi: ");
                int t = input.nextInt();
                System.out.print("LuasAlas: ");
                int LuasAlas = input.nextInt();
                System.out.println(Limas(t, LuasAlas));
            }
            case 4 -> {
                System.out.println("Menu volume Prisma\n");
                System.out.print("panjang: ");
                int p = input.nextInt();
                System.out.print("Lebar: ");
                int l = input.nextInt();
                System.out.print("Tinggi: ");
                int t1 = input.nextInt();
                System.out.println(Prisma(p, l, t1));
            }
            case 5 -> {
                System.out.println("Menu volume Tabung\n");
                System.out.print("Jari-jari: ");
                int r = input.nextInt();
                System.out.print("Tingggi: ");
                int t2 = input.nextInt();
                System.out.println(Tabung(r, t2));
            }
        }
    }
    public static int kubus(int rusuk) {
        return rusuk * rusuk * rusuk;
    }
    public static int balok(int P, int L, int t) {
        return P * L * t;
    }
    public static int Limas(int T, int LuasAlas) {
        return (int) (0.3 * LuasAlas * T);
    }

    public static int Prisma(int P, int L, int T) {
        return (int) (0.5 * (P * L * T));
    }

    public static int Tabung(int r, int T) {
        return (int) (3.14 * Math.pow(r, 2) * T);

    }
}
