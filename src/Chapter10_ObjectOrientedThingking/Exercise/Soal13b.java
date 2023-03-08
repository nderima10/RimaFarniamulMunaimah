package Chapter10_ObjectOrientedThingking.Exercise;

import Chapter11_InheritanceAndPolymorphism.Exercise.Soal2b_Employee;

public class Soal13b {
    private double x;
    private double y;
    private double width;
    private double height;

    Soal13b() {
        this(0,0,1,1);
    }

    public Soal13b(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }
    public void setY(double y) {

        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2* (width + height);
    }
    public boolean contains(double x, double y) {
        return getDistance(this.y,y) <= height / 2 &&
                getDistance(this.x,x) <= width /2;
    }
    public boolean contains(Soal13b r) {
        return
               getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                       getDistance(x, r.getX()) + r.getWidth() /  2 <= width / 2 &&
                       height / 2 + r.getHeight() / 2 <= height &&
                       width / 2 + r.getWidth() / 2 <= width;
    }
    public boolean overlaps(Soal13b r) {
        return !contains(r) &&
                ((x +  width /2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    public double getDistance(double  p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}
