package Chapter13_AbstractClassesAndInterfaces.Exercise;

public class Soal5b_Rectangle extends Soal1b_GeometriObject{
    private double width;
    public double height;
    public Soal5b_Rectangle(){

    }

    public Soal5b_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Soal5b_Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
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
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double  getPerimeter() {
        return 2 * (width * height);
    }
    @Override
    public String toString() {
        return super.toString() + "\nWidth: " +width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
