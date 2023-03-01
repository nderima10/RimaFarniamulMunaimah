package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing12_TestRational {
    public static void main(String[] args) {
        Listing13_Rational r1 = new Listing13_Rational(4, 2);
        Listing13_Rational r2 = new Listing13_Rational(2,3);

        System.out.println(r1 + " + " + r2 + " = " +r1.add(r2));
        System.out.println(r1 + " + " + r2 + " = " +r1.subtract(r2));
        System.out.println(r1 + " + " + r2 + " = " +r1.multiply(r2));
//        System.out.println(r1 + " + " + r2 + " = " +r1.divide(r2));
//        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
