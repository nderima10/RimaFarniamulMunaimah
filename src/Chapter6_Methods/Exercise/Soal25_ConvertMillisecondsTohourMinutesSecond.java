package Chapter6_Methods.Exercise;

import java.util.Scanner;

public class Soal25_ConvertMillisecondsTohourMinutesSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan millisecond: ");
        long millis = input.nextLong();
        System.out.println("hor:minutes:second: " +convertMillis(millis));
    }
    public static String convertMillis (long millis){
        millis /= 1000;
        String currenMinutesAndSecond = "";
        for (int i = 0; i < 2; i++) {
            currenMinutesAndSecond = " : " + millis % 60 + currenMinutesAndSecond;
            millis /= 60;
        }
        return millis + currenMinutesAndSecond;
    }
}
