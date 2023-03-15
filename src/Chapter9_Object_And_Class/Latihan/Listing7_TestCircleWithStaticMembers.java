package Chapter9_Object_And_Class.Latihan;

public class Listing7_TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Sebelum membuat objek");
        System.out.println("Banyaknya objek lingkaran adalah " + Listing6_CircleWithStaticMembers.numberOfObject);

        Listing6_CircleWithStaticMembers c1 = new Listing6_CircleWithStaticMembers();
        System.out.println("\nsetelah menciptakan c1");
        System.out.println("c1: radius ("+c1.radius + ") dan nomor od objek lingkaran (" + c1.numberOfObject + ")");

        Listing6_CircleWithStaticMembers c2 = new Listing6_CircleWithStaticMembers(5);
        c1.radius = 9;

        System.out.println("\nSetelah membuat c2 dan memodifikasi c1");
        System.out.println("c2: radius ("+c2.radius + ") dan jumlah objek lingkaran (" + c2.numberOfObject+ ")");
    }
}
