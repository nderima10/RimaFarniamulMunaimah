package Chapter6_Methods.Exercise;

public class Soal16_NumberOfDaysInYear {
    public static void main(String[] args) {
        System.out.printf("yesar     days in Year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "      " + numberOfdaysInYear (year));
        }
    }
    public static int numberOfdaysInYear (int year) {
        if (isleapYear(year))
            return 366;
        else
            return 365;
    }
    public static boolean isleapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
