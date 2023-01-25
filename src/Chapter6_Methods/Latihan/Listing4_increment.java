package Chapter6_Methods.Latihan;

public class Listing4_increment {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }
    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
