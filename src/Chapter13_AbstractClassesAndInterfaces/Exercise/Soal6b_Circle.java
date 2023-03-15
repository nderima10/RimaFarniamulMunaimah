package Chapter13_AbstractClassesAndInterfaces.Exercise;

public class Soal6b_Circle extends Soal6b_GeometricObject {
    private double radius;
    public  Soal6b_Circle(){
    }
    public  Soal6b_Circle(double radius){
        this.radius = radius;
    }
    public  Soal6b_Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double  getDiameter(){
        return 2 * radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return super.toString() + "\nDate created: " + getDateCreated() + "\nRadius: " + radius;
    }
}
