package Chapter2_Elementary.Tugas;

import java.util.Scanner;

public class Ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan berat badan: ");
        double bb = input.nextDouble();
        System.out.print("Masukan tinggi badan: ");
        double tb = input.nextDouble();

        double meter = tb/100;
        double bmi = bb / Math.pow(meter,2);
        double brocaPerempuan = (tb - 100) - (0.15 * (tb - 100));

        if (bmi < 18.5){
            System.out.println("Anda Kurus");
        }else if (bmi <= 22.9){
            System.out.println("Normal");
        }else if (bmi < 24.9){
            System.out.println("OverWeight");
        }else{
            System.out.println("Obesitas");
        }

        System.out.println("Berat badan ideal anda adalah " + brocaPerempuan + "kg" );
        System.out.println("nilai BMI tubuh anda adalah " + String.format("%.2f", bmi));
    }
}
