package Chapter3_Selection.Ujian;

import java.util.Scanner;

public class Ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double broca;
        System.out.print("Masukan jenis kelamin anda L/P : ");
        String jenisKelamin = input.nextLine();
        System.out.print("Masukan berat badan : ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukan tinggi badan : ");
        double tinggiBadan = input.nextDouble();
        double a = tinggiBadan - 100;
        double b = tinggiBadan - 100;

        broca = 0;
        switch (jenisKelamin) {
            case "L" : System.out.print("jenis kelamin anda laki laki");
                broca = (tinggiBadan - 100) - (a * 0.1);
                break;
            case "P" : System.out.print("jenis kelamin anda perempuan");
                broca =  (tinggiBadan - 100) - (b * 0.15);
                break;
            default : broca = 0;

        }

        System.out.println("maka berat badan ideal anda adalah " + broca);

        double tbm = tinggiBadan / 100;
        double c = tbm * tbm;
        double bmi = beratBadan / c;
        System.out.println("nilai BMI anda adalah " + bmi);

        System.out.println("BMI : " + bmi + " ");
        if (bmi <= 18.5) {
            System.out.println("maka kategori tubuh anda adalah Kurus");
        }
        else if (bmi <= 24.9)
            System.out.println("Maka kategori tubuh anda  adalah Normal");

        else if (bmi < 29.9)
            System.out.println("Maka kategori tubuh anda adalah Kelebihan berat badan");

        else if (bmi > 30)
            System.out.println("Maka kategori tubuuh anda adalah Obesitas");

    }
}
