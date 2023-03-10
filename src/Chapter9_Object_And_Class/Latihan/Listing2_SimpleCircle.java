package Chapter9_Object_And_Class.Latihan;

public class Listing2_SimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Luas lingkaran jari-jari " +
                circle1.radius + " is " + circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("Luas lingkaran jari-jari " +
                circle2.radius + " is " + circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("Luas lingkaran jari-jari " +
                circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("Luas lingkaran jari-jari " +
                circle2.radius + " is " + circle2.getArea());
    }
    double radius;
    Listing2_SimpleCircle() {
        radius = 1;
    }
    Listing2_SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
