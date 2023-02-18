package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing2_CircleFromSimpleGeometricObject
    extends Listing1_SimpleGeometricObject{
private double radius;

public Listing2_CircleFromSimpleGeometricObject() {
}
public Listing2_CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
}
public Listing2_CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
}
public double getRadius() {
    return radius;
}
public void setRadius(double radius) {
    this.radius = radius;
}
public double getArea() {
    return radius * radius * Math.PI;
}
public double getDiamneter() {
    return 2 * radius;
}
public double getPerimeter() {
    return 2 * radius * Math.PI;
}
public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
}
}


