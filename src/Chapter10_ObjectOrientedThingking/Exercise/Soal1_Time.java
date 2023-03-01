package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal1_Time {
    public static void main(String[] args) {
        Soal1b_Time time1 = new Soal1b_Time();
//        Soal1b_Time time2 = new Soal1b_Time(555550000);

        System.out.println(time1.getHour() + ":" +time1.getMinute() + ":" +time1.getSecond());
//        System.out.println(time2.getHour() + ":" +time2.getMinute() + ":" +time2.getSecond());
    }
}
