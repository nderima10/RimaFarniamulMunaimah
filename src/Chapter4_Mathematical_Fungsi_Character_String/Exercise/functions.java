package Chapter4_Mathematical_Fungsi_Character_String.Exercise;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x, f;
    System.out.print("Masukan nilai (x) : ");

    x = input.nextDouble();
    f = (x + 2) * x;

    System.out.print("Fungsi dari f(x) adalah " + f);
}
}
