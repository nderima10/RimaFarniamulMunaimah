package Chapter9_Object_And_Class.Exercise;

public class soal1_TheRectangleClass {
    public static void main(String[] args) {
        Soal1b_Rectangle rectangle1 = new Soal1b_Rectangle(4, 40);
        Soal1b_Rectangle rectangle2 = new Soal1b_Rectangle(3.5, 35.9);

        System.out.println("\n recatngle 1");
        System.out.println("-------------");
        System.out.println("Width       : " + rectangle1.width);
        System.out.println("Height      : " + rectangle1.height);
        System.out.println("Area        : " + rectangle1.getArea());
        System.out.println("Perimeter   : " + rectangle1.getPerimeter());

        System.out.println("\n recatngle 2");
        System.out.println("-------------");
        System.out.println("Width       : " + rectangle2.width);
        System.out.println("Height      : " + rectangle2.height);
        System.out.println("Area        : " + rectangle2.getArea());
        System.out.println("Perimeter   : " + rectangle2.getPerimeter());
    }
}
