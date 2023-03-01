package Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing11_House {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public Listing11_House(int id, double area) {
        this.id = id;
        this.area = area;

        whenBuilt = new java.util.Date();
    }
    public int getId() {
        return id;
    }
    public double getArea() {
        return area;
    }
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    public int compareTo(Listing11_House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}
