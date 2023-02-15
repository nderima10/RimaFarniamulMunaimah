package Chapter8_MultidimensionalArray.Latihan;

import java.util.Scanner;

public class Listing5_Weater {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_YEARS = 24;
        double[][][] data = new double [NUMBER_OF_DAYS][NUMBER_OF_YEARS][2];

        Scanner input = new Scanner(System.in);
        for (int y = 0; y < NUMBER_OF_DAYS * NUMBER_OF_YEARS; y++) {
            int day =  input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailytemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_YEARS; j++) {
                dailytemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }
            System.out.println("Hari " + i + " suhu rata-rata adalah " + dailytemperatureTotal / NUMBER_OF_YEARS);
            System.out.println("Hari " + i + " kelembaban rata-rata adalah " + dailyHumidityTotal / NUMBER_OF_YEARS);
        }
    }
}
