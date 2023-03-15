package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

public class Listing10_InvalidRadiusException extends Exception{
    private double radius;
    public Listing10_InvalidRadiusException(double radius){
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
