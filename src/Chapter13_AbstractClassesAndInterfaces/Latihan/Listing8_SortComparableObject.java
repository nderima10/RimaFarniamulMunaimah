package Chapter13_AbstractClassesAndInterfaces.Latihan;

import java.math.BigInteger;

public class Listing8_SortComparableObject {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlantic", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.println(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("\"2323231092923992"), new BigInteger("25362372637635652"), new BigInteger("434324223")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
}
