package Chapter9_Object_And_Class.Latihan;

public class Listing7_TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creatiing object");
        System.out.println("The number of circle object is " + Listing6_CircleWithStaticMembers.numberOfObject);

        Listing6_CircleWithStaticMembers c1 = new Listing6_CircleWithStaticMembers();
        System.out.println("\nafter creating c1");
        System.out.println("c1: radius ("+c1.radius + ") and number od circle object (" + c1.numberOfObject + ")");

        Listing6_CircleWithStaticMembers c2 = new Listing6_CircleWithStaticMembers(5);
        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifyng c1");
        System.out.println("c2: radius ("+c2.radius + ") and number of circle object (" + c2.numberOfObject+ ")");
    }
}
