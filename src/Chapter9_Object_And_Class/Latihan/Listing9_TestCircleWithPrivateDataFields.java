package Chapter9_Object_And_Class.Latihan;

public class Listing9_TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        Listing8_CircleWithPrivateDataFields myCircle =
                new Listing8_CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of teh circle of radius " +
                myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of object created is " + Listing8_CircleWithPrivateDataFields.getNumberOfObject());
    }
}
