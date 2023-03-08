package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal4b {
    private double x;
    private double y;

    Soal4b() {
        this(10, 30.5);
    }

    public Soal4b(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Soal4b myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                Math.pow(myPoint.getY() - y, 2));
    }
    public double distance(double x, double y) {
        return distance(new Soal4b(x, y));
    }
}
