package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing3_rectangFromsimpleGeometriObject
extends Listing1_SimpleGeometricObject {
    private double width;
    private double height;
    public Listing3_rectangFromsimpleGeometriObject (double widht, double height) {
        this.width =widht;
        this.height = height;
    }
    public Listing3_rectangFromsimpleGeometriObject(double width, double height, String color, boolean filled) {
        this. width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidht(){
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArray() {
        return width * height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

}
