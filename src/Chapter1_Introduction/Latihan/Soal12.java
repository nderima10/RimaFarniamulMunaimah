package Chapter1_Introduction.Latihan;

public class Soal12 {
    public static void main(String[] string) {
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;
        double distanceInKilometers = distanceInMiles * 1.60934;
        double timesInMinutes = hours * 60.0 + minutes + seconds / 60.0;
        double kilometersPenHour = 60.0 * distanceInKilometers / timesInMinutes;
        System.out.println(kilometersPenHour);
    }
}
