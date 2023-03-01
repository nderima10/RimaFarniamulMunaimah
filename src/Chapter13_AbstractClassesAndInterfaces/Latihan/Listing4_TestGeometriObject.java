package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing4_TestGeometriObject {
    public static void main(String[] args) {
//        Listing1_GeometryObject geoObject1 = new Listing2_Circle();
//        Listing1_GeometryObject geoObject2 = new Listing3_Rectangle();

//        System.out.println("The two object have the same area? " + equalArea(geoObject1, geoObject2));

//        displayGeometricObject(geoObject1);
//        displayGeometricObject(geoObject2);
    }
    public static boolean equalArea(Listing1_GeometryObject object1, Listing1_GeometryObject object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometricObject(Listing1_GeometryObject object) {
        System.out.println();
        System.out.println("The area is" + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
