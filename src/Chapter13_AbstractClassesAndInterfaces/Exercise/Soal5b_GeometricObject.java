package Chapter13_AbstractClassesAndInterfaces.Exercise;

public abstract class Soal5b_GeometricObject implements Comparable<Soal5b_GeometricObject>{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected Soal5b_GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected Soal5b_GeometricObject(String color, boolean filled) {
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
    public boolean isFilled(boolean filled) {
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
        return "created on" + dateCreated + "\nColor" + color + "and filled" + filled;
    }
}
