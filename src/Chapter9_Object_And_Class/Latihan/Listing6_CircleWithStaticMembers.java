package Chapter9_Object_And_Class.Latihan;

public class Listing6_CircleWithStaticMembers {
    double radius;
    static int numberOfObject = 0;
    Listing6_CircleWithStaticMembers() {
        radius = 1;
        numberOfObject++;
    }
    Listing6_CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObject++;
    }
    static int getNumberOfObject() {
        return numberOfObject;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}
