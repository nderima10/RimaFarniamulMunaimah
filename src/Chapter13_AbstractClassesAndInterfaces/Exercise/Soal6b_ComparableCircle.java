package Chapter13_AbstractClassesAndInterfaces.Exercise;

public class Soal6b_ComparableCircle extends Soal6b_Circle implements Comparable <Soal6b_ComparableCircle> {
public Soal6b_ComparableCircle() {
}
public Soal6b_ComparableCircle(double radius) {
    super(radius);
}
public Soal6b_ComparableCircle(double radius, String color, boolean filled){
    super(radius,color,filled);
}
@Override
    public int compareTo(Soal6b_ComparableCircle o) {
    if (getArea() > o.getArea())
        return 1;
    else if(getArea() < o.getArea())
        return -1;
    else
        return 0;
}
@Override
    public String toString() {
    return super.toString() + "\nArea: " + getArea();
}
}
