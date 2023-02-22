package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing5_PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Listing2_CircleFromSimpleGeometricObject
                (1, "red", false));
        displayObject(new Listing3_rectangFromsimpleGeometriObject
                (1,1, "black", true));
    }
    public static void displayObject(Listing1_SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                " color is " + object.getColor());
    }
}
