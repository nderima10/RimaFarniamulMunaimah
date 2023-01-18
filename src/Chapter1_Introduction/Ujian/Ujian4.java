package Chapter1_Introduction.Ujian;

public class Ujian4 {
    public static void main(String[] args) {
        double hours = 2;
        double minutes = 30;
        double seconds = 45;
        double distanceInMiles = 50;
        double KecepatanRatarata = distanceInMiles / (hours + (minutes / 60) + (seconds / 3600)) * 1.6;
        System.out.println("Miles / (hours  +  (minutes / 60)  +  (seconds / 3600)) * 1.6");
        System.out.println("50    / (2      +  (30      / 60)  +  (45      / 3600)) * 1.6");
        System.out.print("Kecepatan rata rata dalam kilometer perr jam adalah ");
        System.out.printf("%.2f", KecepatanRatarata);
        System.out.print(" km/jam");
    }
}
