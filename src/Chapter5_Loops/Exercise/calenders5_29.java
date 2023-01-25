package Chapter5_Loops.Exercise;

import java.util.Scanner;

public class calenders5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();

        String header;
        System.out.println();
        for (int month = 1; month <= 12; month++){
            header = "";

            switch (month) {
                case 1: header += "januari "; break;
                case 2: header += "februari"; break;
                case 3: header += "maret"; break;
                case 4: header += "april"; break;
                case 5: header += "mei"; break;
                case 6: header += "juni"; break;
                case 7: header += "juli"; break;
                case 8: header += "agustus"; break;
                case 9: header += "september"; break;
                case 10: header += "oktober"; break;
                case 11: header += "november"; break;
                case 12: header += "desember"; break;
            }
            header += year + "";

            for (int b = 0; b < 23 - (header.length() / 2);b++) {
                System.out.print(" ");
            }
            System.out.println(header + "\n---------------------------------------------\n"
            + "sun     mon    tue    wed    thu    fri    sat");

            day %=  7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }
            int lastDay = 0;
            if (month == 1 || month == 3 || month ==  5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
                lastDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                    lastDay += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || ((year & 400) == 0))
                    lastDay += 29;
                else
                    lastDay += 28;
            }
            for (int d = 1; d <= lastDay; d++) {
                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");
                    if (d == lastDay)
                        System.out.println();
                }
                day++;
            }
            System.out.println();
        }
    }
}
