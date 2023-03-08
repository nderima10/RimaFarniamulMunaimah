package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.GregorianCalendar;

public class Soal2b_MyDate {
    private int  year;
    private int month;
    private int day;

    Soal2b_MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    Soal2b_MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public Soal2b_MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }
    public String getDay(){
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
