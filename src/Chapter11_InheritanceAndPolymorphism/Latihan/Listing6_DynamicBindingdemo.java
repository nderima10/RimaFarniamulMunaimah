package Chapter11_InheritanceAndPolymorphism.Latihan;

public class Listing6_DynamicBindingdemo {
    public static void main(String[] args) {
        m(new graduateStudent());
        m(new student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x) {
        System.out.println(x.toString());
    }
}
class graduateStudent extends student {

}
class student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}
class Person {
    @Override
    public String toString() {
        return "Person";
    }
}
