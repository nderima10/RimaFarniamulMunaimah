package Chapter9_Object_And_Class.Latihan;

public class Listing10_TeastPassObject {
    public static void main(String[] args) {
        Listing8_CircleWithPrivateDataFields myCircle = new Listing8_CircleWithPrivateDataFields(1);

        int n = 5;
        prinitAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }
    public static void prinitAreas(Listing8_CircleWithPrivateDataFields c, int times) {
        System.out.println("radius \t\t Area");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
