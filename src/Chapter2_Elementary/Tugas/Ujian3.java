package Chapter2_Elementary.Tugas;

import java.util.Scanner;

public class Ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka 1000 sampai 9999: ");
        int angka = input.nextInt();
        int kurangDari1010 = angka % 10;
        angka /= 10;
        int puluhan = angka % 10;
        angka /= 10;
        int ratusan = angka % 10;
        angka /= 10;
        int ribuan = angka % 10;
        angka /= 10;

        int jumlah = ribuan + ratusan + puluhan + kurangDari1010;
        System.out.println("jumlahnya adalah " + jumlah);
    }
}
