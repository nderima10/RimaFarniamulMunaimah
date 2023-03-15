package Chapter13_AbstractClassesAndInterfaces.Exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Soal4_ColorAndFond {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise_13_4 month year");
            System.exit(1);
        }
        Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);
        printHeader(calendar);

        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
            System.out.print(" ");
        while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
            System.out.printf("%4d\n", calendar.get(Calendar.DATE));
            else
                System.out.printf("%4d", calendar.get(Calendar.DATE));

            calendar.add(Calendar.DATE, 1);
        }
        System.out.printf("%4d\n", calendar.get(Calendar.DATE));
    }
    public static String[] getMonths() {
        String[] months = {"Januari", "Februari", "Maret","April","Mei","juni","Juli",
        "Agustus","September","Oktober","November","Desember"};
        return months;
    }
    public static void printHeader(Calendar calendar) {
        String[] months = getMonths();

        int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
        System.out.println();
        for (int i = 0; i < length; i++)
            System.out.print("");
        System.out.println(months[calendar.get(Calendar.MONTH)] + ", " +
                calendar.get(Calendar.YEAR));
        System.out.println("----------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri sat");
    }
}
