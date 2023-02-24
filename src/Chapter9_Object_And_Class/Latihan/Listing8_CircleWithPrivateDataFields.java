package Chapter9_Object_And_Class.Latihan;

public class Listing8_CircleWithPrivateDataFields {
    private double radius = 1;
    private static int numberOfObject = 0;

    public Listing8_CircleWithPrivateDataFields() {
        numberOfObject++;
    }
    public Listing8_CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObject++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObject() {
        return numberOfObject;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
