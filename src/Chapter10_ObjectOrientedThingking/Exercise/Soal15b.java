package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal15b {
    private double x;
    private double y;
    private double height;
    private double width;

    Soal15b(){
        this(0,0,1,1);
    }

    public Soal15b(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    public static Soal15b getRectangle(double[][] points){
        final int COLUMN_X = 0;
        final int COLUMN_Y = 1;
        double[] minMaxX = minMax(points, COLUMN_X);
        double[] minMaxY = minMax(points, COLUMN_Y);
        double x = (minMaxX[1] + minMaxX[0]) / 2;
        double y = (minMaxY[1] + minMaxY[0]) / 2;
        double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));
        double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));
        return new Soal15b(x,y,width,height);
    }
    private static double[] minMax(double[][] points, int col){
        double[]  minMax = new double[2];
        minMax[0] = minMax[1] =points[0][col];
        for (int i = 0; i < points.length; i++){
            if (points[i][col] < minMax[0])
                minMax[0] = points[i][col];
            if (points[i][col] < minMax[1])
                minMax[0] = points[i][col];
        }
        return minMax;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double  getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public boolean contains(double x, double y){
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }
    public boolean contains(Soal15b r){
        return
                getDistance(y, r.getY()) + r.getHeight() / 2 <=  height / 2 &&
                getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        height / 2 + r.getHeight() / 2 <= height &&
                        width / 2 + r.getWidth() / 2 <= width;
    }
    public boolean overlaps(Soal15b r){
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    private double getDistance(double p1, double p2){
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}
