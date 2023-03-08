package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal13_MyRectangle2D {
    public static void main(String[] args) {
        Soal13b r1 = new Soal13b(2,2,5.5,4.9);

        System.out.println("\nRectangle: ");
        System.out.println("area: " +  r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println((r1.contains(3,3) ? "Contains " : " Does not contains") +
                " the point(3,3).");
        System.out.println((r1.contains(new Soal13b(4,5,10.5,3.2)) ? "Contains" :
                "Does not contain") + "the rectangle with points(4,5,10.5,3.2)");
        System.out.println((r1.overlaps(new Soal13b(3,5,2.3,5.4)) ? "Overlap" :
                "Does not overlap") + " the rectangle  with points (3,5,2.3,5.4)");
    }
}
