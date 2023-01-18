package Chapter4_Mathematical_Fungsi_Character_String.Latihan;

public class estimateArea3 {
    private static final double AVERAGE_EARTH_RADIUS = 6371.01;
    public static void main(String[] args) {

        double atlantaGeoY = -84.3879824;
        double atlantaGeoX = 33.7489954;

        double orLandoFLY = -81.3792364999;
        double orLandoFLX = 28.5383355;

        double savannahGeoY = -81.09983419999998;
        double savannahGeoX = 32.0835407;

        double charLotteNCY = -80.84312669999997;
        double charLotteNCX = 35.2270869;

        double t1side1 = distanceBetweenTwoPointsGEOGRAPH(atlantaGeoX, atlantaGeoY, savannahGeoX, savannahGeoY);
        double t1side2 = distanceBetweenTwoPointsGEOGRAPH(savannahGeoX, savannahGeoY, charLotteNCX, charLotteNCY);
        double t1side3 = distanceBetweenTwoPointsGEOGRAPH(charLotteNCX, charLotteNCY, atlantaGeoX, atlantaGeoY);

        double t2side1 = distanceBetweenTwoPointsGEOGRAPH(atlantaGeoX, atlantaGeoY, orLandoFLX, orLandoFLY);
        double t2side2 = distanceBetweenTwoPointsGEOGRAPH(orLandoFLX, orLandoFLY, savannahGeoX, savannahGeoY);
        double t2side3 = distanceBetweenTwoPointsGEOGRAPH(savannahGeoX, savannahGeoY, atlantaGeoX, atlantaGeoY);

        boolean isTriangle1 = isTriangle(t1side1, t1side2, t1side3);
        boolean isTriangle2 = isTriangle(t2side1, t2side2, t2side3);

        if (isTriangle1 && isTriangle2) {
            double area1 = getTriangleArea(t1side1, t1side2, t1side3);
            double area2 = getTriangleArea(t2side1, t2side2, t2side3);
            System.out.printf("Triangle 1 : %f -- %f -- %f : area = %f\n", t1side1, t1side2, t1side3, area1);
            System.out.printf("Triangle 2 : %f -- %f -- %f : area = %f\n", t2side1, t2side2, t2side3, area2);
            double totalArea = area1 + area2;
            System.out.println("The area of the triangle is " + totalArea);
        } else {
            System.out.println("Sorry the coordinates are incorrect");
        }
    }
    public static  double  distanceBetweenTwoPointsGEOGRAPH(double x1, double y1, double x2, double y2) {
        double distance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        return distance;
    }
    public static double getTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
    public static  boolean isTriangle(double side1, double side2, double side3) {
        return ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));
    }
}
