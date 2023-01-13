package Chapter4.Ujian;

import java.util.Scanner;

public class Soal_1 {
  public static void main(String[] args) {
      int num;


          System.out.println("---");
          Scanner scan = new Scanner(System.in);

          System.out.print("\nMasukkan Bilangan Biner :");
          num = Integer.parseInt(scan.nextLine(), 2);

          String hexa = Integer.toHexString(num);
          System.out.println("Bilangan Hexadecimalnya adalah: " + hexa);
  }
}
