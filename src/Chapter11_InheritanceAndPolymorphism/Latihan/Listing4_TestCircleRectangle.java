package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing4_TestCircleRectangle {
    public static void main(String[] args) {
        Listing2_CircleFromSimpleGeometricObject circle =
                new Listing2_CircleFromSimpleGeometricObject(1);

        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiamneter());

        Listing3_rectangFromsimpleGeometriObject rectangle =
                new Listing3_rectangFromsimpleGeometriObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
