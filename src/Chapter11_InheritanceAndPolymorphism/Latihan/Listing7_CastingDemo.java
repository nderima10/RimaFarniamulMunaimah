package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing7_CastingDemo {
    public static void main(String[] args) {
        Object object1 = new
                Listing2_CircleFromSimpleGeometricObject(1);
        Object object2 = new
                Listing3_rectangFromsimpleGeometriObject(1, 1);
        displayObject(object1);
        displayObject(object2);
        }
    public static void displayObject(Object object) {
        if (object instanceof Listing2_CircleFromSimpleGeometricObject) {
            System.out.println("The circle area is " +
                    ((Listing2_CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " +
                    ((Listing2_CircleFromSimpleGeometricObject)object).getDiamneter());
            }
        else if (object instanceof Listing3_rectangFromsimpleGeometriObject) {
            System.out.println("The rectangle area is " +
                    ((Listing3_rectangFromsimpleGeometriObject)object).getArea());
        }
    }
}
