package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal2_useBMI {
    public static void main(String[] args) {
        Soal2b bmi1 = new Soal2b("Kim yang", 18, 145, 5, 10);
        System.out.println("The BMI for " +  bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus());

        Soal2b bmi2 = new Soal2b("Susang King", 215, 70);
        System.out.println("The BMI for " +  bmi2.getName() + " is " +
                bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
