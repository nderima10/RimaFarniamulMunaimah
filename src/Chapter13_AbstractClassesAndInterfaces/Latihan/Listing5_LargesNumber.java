package Chapter13_AbstractClassesAndInterfaces.Latihan;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Listing5_LargesNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);

        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The larges number is " + getLargesNumber(list));
    }
    public static Number getLargesNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (number.doubleValue() < list.get(i).doubleValue()) number = list.get(i);

        return number;
    }
}
