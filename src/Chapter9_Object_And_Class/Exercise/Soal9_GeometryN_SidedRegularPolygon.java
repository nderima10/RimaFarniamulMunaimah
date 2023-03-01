package Chapter9_Object_And_Class.Exercise;

public class Soal9_GeometryN_SidedRegularPolygon {
    public static void main(String[] args) {
        Soal9b_RegularPolygon regularPolygon1 = new Soal9b_RegularPolygon();
        Soal9b_RegularPolygon regularPolygon2 = new Soal9b_RegularPolygon(6, 4);
        Soal9b_RegularPolygon regularPolygon3 = new Soal9b_RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("\n-------------------------------------------");
        System.out.println("| Regular Polygon Object |  Perimeter | Area");
        System.out.println("-------------------------------------------");
        System.out.printf("|       object# 1       |%8.2f      |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf("|       object# 1       |%8.2f      |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf("|       object# 1       |%8.2f      |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("-------------------------------------------");
    }
}
