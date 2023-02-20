package Chapter11_InheritanceAndPolymorphism.Latihan;

import java.util.ArrayList;

public class Listing8_TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("'Is miami in the list? " + cityList.contains("Miami"));
        System.out.println("the location of denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("is the list empty? " + cityList.isEmpty());

        cityList.add(2, "'xian");
        cityList.remove("Miami");
        cityList.remove(1);

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
            System.out.println();

            ArrayList<Listing2_CircleFromSimpleGeometricObject> list = new ArrayList<>();

            list.add(new Listing2_CircleFromSimpleGeometricObject(2));
            list.add(new Listing2_CircleFromSimpleGeometricObject(3));

            System.out.println("the area of the circle? " + list.get(0).getArea());
        }
    }
}
