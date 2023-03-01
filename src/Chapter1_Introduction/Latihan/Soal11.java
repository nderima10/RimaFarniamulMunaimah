package Chapter1_Introduction.Latihan;

public class Soal11 {
    public static void main(String[] args) {
        double birtRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;
        double currentPopulation = 312032486;
        double secondInYears = 60 * 60 * 24 * 365;
        double numBirths = secondInYears / birtRateInSeconds;
        double numDates = secondInYears / deathRateInSeconds;
        double numImmigrants = secondInYears / newImmigrantInSeconds;
        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDates;
            System.out.println("Year " + i + " = " + (int)currentPopulation);
        }
    }
}
