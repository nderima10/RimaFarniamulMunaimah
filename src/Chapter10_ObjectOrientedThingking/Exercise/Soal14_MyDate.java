package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal14_MyDate {
    public static void main(String[] args) {
        Soal14b date1 = new Soal14b();
        Soal14b date2 = new Soal14b(1234345545656L);

        System.out.println("date1: " + date1.getMonth() +"/" + date1.getDay() +
                "/" + date1.getYear());
        System.out.println("date2: " + date2.getMonth() + "/" + date2.getDay() +
                "/" + date2.getYear());
    }
}
