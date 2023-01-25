package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal23_OccurenceOfSpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan string diikuti dengan karakter e.g. selamat datang, e: ");
        String string = input.nextLine();

        int k = string.indexOf(", ");
        String str = string.substring(0, k);
        char ch = str.charAt(k + 2);

        System.out.println("Jumlah nomor dari kejadian nomor \"" +ch + "\" in \'" + str + "\" adalah: " + count(str, ch));
    }
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}
