package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal11_Circle2D {
    public static void main(String[] args) {
        Soal11b c1 =  new Soal11b(2,2,5.5);

        System.out.println("Circle1 area: " + c1.getArea());
        System.out.println("Circle1 perimeter: " + c1.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3) ? " + c1.contains(3, 3));
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? " +c1.contains(new Soal11b(4,5,10.5)));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " + c1.overlaps(new Soal11b(3,5,2.3)));
    }
}
