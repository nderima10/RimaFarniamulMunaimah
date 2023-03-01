package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing10_SortRectangles {
    public static void main(String[] args) {
        Listing9_ComparableRectangle[] rectangles = {
                new Listing9_ComparableRectangle(3.4, 5.4),
                new Listing9_ComparableRectangle(13.24, 55.4),
                new Listing9_ComparableRectangle(7.4, 35.4),
                new Listing9_ComparableRectangle(1.4, 25.4)};
        java.util.Arrays.sort(rectangles);
        for (Listing3_Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
