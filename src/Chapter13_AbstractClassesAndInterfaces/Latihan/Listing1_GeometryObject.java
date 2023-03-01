package Chapter13_AbstractClassesAndInterfaces.Latihan;

public abstract class Listing1_GeometryObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected Listing1_GeometryObject() {

         dateCreated = new java.util.Date();
    }
    protected Listing1_GeometryObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated1() {
        return dateCreated;
    }
    public String toString() {
        return "Create on" + dateCreated + "\ncolor:" + color + " and filled: " + filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
