package Chapter11_InheritanceAndPolymorphism.Exercise;

import java.util.ArrayList;
import java.util.Date;

public class Soal6_UseArrayList {
    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList<Object>();
            o.add(new Soal6b_Loan());
            o.add(new Date());
            o.add(new String("String class"));
            o.add(new Soal6b_Circle());

            for (int i = 0; i < o.size(); i++) {
                System.out.println((o.get(i)).toString());
            }

    }
}
