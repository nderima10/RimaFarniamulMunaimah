package Chapter6_Methods.Ujian;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Ujian6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("volume bangun ruang balok");
        System.out.print("Masukan panjang : ");
        double P = input.nextDouble();
        System.out.print("Masukan Lebar : ");
        double L = input.nextDouble();
        System.out.print("Masukan Tinggi : ");
        double T = input.nextDouble();
        System.out.println("Volume balok adalah : " + VolumeBalok(P, L, T));
        System.out.println("Volume Tabung adalah : " + volumeTabung(P, L, T));
        System.out.println("Volume Kubus adalah : " + VolumeKubus(P, L, T));
        System.out.println("Volume Kerucut adalah : " + VolumeKerucut(P, L, T));
        System.out.println("Volume Bola adalah : " + VolumeBola(P, L, T));
        }
        public static double VolumeBalok (double P, double L, double T) {
        return P * L * T;
    }
        public static double volumeTabung (double P, double L, double T) {return P + L + T;}
        public static double VolumeKubus (double P, double L, double T) {
        return P * L + T;
    }
        public static double VolumeKerucut(double P, double L, double T) {
        return P + L * T;
    }
        public static double VolumeBola(double P, double L, double T) { return P + T;}
}
