package Chapter6_Methods.Latihan;

import java.util.Scanner;

public class TutorialDasarMethodeKembalianYt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y;
        System.out.print("Masukan nilai x : ");
        int x = input.nextInt();
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }
    static int hitung(int input) {
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
}
