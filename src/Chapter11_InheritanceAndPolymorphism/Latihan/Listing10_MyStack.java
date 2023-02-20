package Chapter11_InheritanceAndPolymorphism.Latihan;

import java.util.ArrayList;
import java.util.Objects;

public class Listing10_MyStack {
    private ArrayList<Objects> list = new ArrayList<>();
     public boolean isEmpaty() {
         return list.isEmpty();
     }
     public int getSize() {
         return list.size();
     }
     public Objects peek() {
         return list.get(getSize() - 1);
     }
     public Objects pop() {
         Objects o = list.get(getSize() - 1);
         list.remove(getSize() - 1);
         return o;
     }
     public void push(Objects o) {
         list.add(o);
     }
     @Override
    public String toString() {
         return "Stack: " + list.toString();
     }
}
