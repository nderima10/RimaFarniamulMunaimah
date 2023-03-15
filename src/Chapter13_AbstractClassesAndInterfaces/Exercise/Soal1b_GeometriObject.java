package Chapter13_AbstractClassesAndInterfaces.Exercise;

public abstract class Soal1b_GeometriObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    protected Soal1b_GeometriObject () {
        dateCreated = new java.util.Date();
    }


    protected Soal1b_GeometriObject (String color, boolean filled) {
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
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on" + dateCreated + "\nColor: " + color + "and filled: " + filled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
