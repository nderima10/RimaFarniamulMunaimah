package Chapter13_AbstractClassesAndInterfaces.Exercise;

import org.jetbrains.annotations.NotNull;

public class Soal5b_Circle extends Soal5b_GeometricObject{
    private double radius;
    public Soal5b_Circle() {
    }

    public Soal5b_Circle(double radius) {
        this.radius = radius;
    }
    public Soal5b_Circle(double radius, String color, boolean filled) {
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
    public double getDiameter() {
        return  2 * radius;
    }
    public double getPerimeter() {
        return 2 *  radius * Math.PI;
    }
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
    }

    @Override
    public int compareTo(@NotNull Soal5b_GeometricObject o) {
        return 0;
    }
}
