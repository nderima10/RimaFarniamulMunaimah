package Chapter9_Object_And_Class.Latihan;

public class Listing11_TotalArea {
    public static void main(String[] args) {
        Listing8_CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();
            printCircleArray(circleArray);
    }
    public static Listing8_CircleWithPrivateDataFields[] createCircleArray() {
        Listing8_CircleWithPrivateDataFields[] circleArray = new Listing8_CircleWithPrivateDataFields[5];

        for (int i = 0 ; i < circleArray.length; i++) {
            circleArray[i] = new Listing8_CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }
    public static void printCircleArray(Listing8_CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("------------------------------------------------");

        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));;
    }
    public static double sum(Listing8_CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();
        return sum;
    }
}
