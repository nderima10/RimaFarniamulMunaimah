package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

public class Listing7_CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public Listing7_CircleWithException(){
        this(1.0);
    }
    public Listing7_CircleWithException(double newRadius)  {
        setRadius(newRadius);
        numberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double findArea(){
        return radius * radius * 3.14159;
    }
}

