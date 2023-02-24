package Chapter9_Object_And_Class.Exercise;

public class Soal1b_Rectangle {
    double width;
    double height;

    Soal1b_Rectangle() {
        width = 1;
        height = 1;
    }
    Soal1b_Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
