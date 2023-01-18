package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

import java.util.Scanner;

public class daysMonth17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a Year : ");
        int year = input.nextInt();
        System.out.print("Enter a month : ");
        String month = input.next();
        boolean leapYear = ((year % 4 == 0) && 400 == 0);

        System.out.print(month + " " + year + " has ");

        if (month.equals("jan") ||
                month.equals("mar") ||
                month.equals("may") ||
                month.equals("juli") ||
                month.equals("ags") ||
                month.equals("okt") ||
                month.equals("des"))
            System.out.println (31 + " days ");
        else if (month.equals("april") ||
                month.equals("juni") ||
                month.equals("sep") ||
                month.equals("Nov"))
            System.out.println(30 + " days ");
        else
            System.out.println(((leapYear) ? 29 : 28) + " days");
    }
}
