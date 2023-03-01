package Chapter10_ObjectOrientedThingking.Latihan;

public class Listing3_UseBMI {
    public static void main(String[] args) {
        Listing4_BMI bmi1 = new Listing4_BMI("Kim Yang ", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus());

        Listing4_BMI bmi2 = new Listing4_BMI("Susan king", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " +
                bmi2.getBMI() + " " + bmi2.getStatus());

    }
}
