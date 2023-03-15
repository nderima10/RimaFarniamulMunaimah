package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal6b_Circle {
    private double  radius = 1;
    private static int numberOfObject = 0;

    public Soal6b_Circle() {
        numberOfObject++;
    }
    public Soal6b_Circle(double newRadius){
        radius = newRadius;
        numberOfObject++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObject(){
        return numberOfObject;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
