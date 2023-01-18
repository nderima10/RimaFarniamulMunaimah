package Chapter5_Loops.Latihan;

public class PiramidLoop5_19 {
    public static void main(String[] args) {
        int mulai = 0, akhir = 7;

        for (int baris = 1; baris <= 128; baris += baris) {
            for (int ruang = 0; ruang < akhir; ruang++) {
                System.out.print("    ");
            }
            for (int I = 1; I <= baris; I += I) {
                System.out.printf("%4d", (I));
            }
            for (int b = mulai; b > 0; b /= 2) {
                System.out.printf("%4d", (b));
            }
            System.out.println();
            akhir--;
            mulai = baris;
        }
    }
}
