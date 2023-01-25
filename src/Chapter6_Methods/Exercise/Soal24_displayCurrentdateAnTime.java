package Chapter6_Methods.Exercise;

import org.jetbrains.annotations.NotNull;

public class Soal24_displayCurrentdateAnTime {
    public static void main(String[] args) {
        System.out.println(time());
        System.out.println(date());
        System.out.println(month());
        System.out.println(day());
    }
    public static String time() {
        final long TIME_ZONE_OFFSET = -4;

        long totalTime = System.currentTimeMillis();

        totalTime /= 1000;

        StringBuilder currentMinuteAndSecond = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            currentMinuteAndSecond.insert(0, (totalTime % 60 < 10 ? ":0" + totalTime % 60 : ":" + totalTime % 60));
            totalTime /= 60;
        }

        String setAmOrPm;
        long currentHour = totalTime % 24;
        if (currentHour == 0)
            currentHour = 24;
        if (currentHour > 12) {
            currentHour -= 12;
            setAmOrPm = " PM";
        }
        else
            setAmOrPm = " AM";
        currentHour += TIME_ZONE_OFFSET;
        return currentHour + currentMinuteAndSecond.toString() + setAmOrPm;
    }
    public static @NotNull String date() {
        return year() + "";
    }
    public static int year() {
        return (int)(System.currentTimeMillis() / millisecondPerYear()) + 1970;
    }
    public static int month() {
        int currentMonth =
                (int)((System.currentTimeMillis() % millisecondPerYear())
                        / millisecondsPerMonth());
        return currentMonth + 1;
    }
    public static int day(){
        return  getTotalNumberOfDays(year(), month());
    }
    public static double millisecondPerYear() {
        return 3.15569E10;
    }
    public static double millisecondsPerMonth() {
        return 2.63E9;
    }
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 400 != 0);
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }
}
