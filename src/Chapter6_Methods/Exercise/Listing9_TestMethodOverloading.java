package Chapter6_Methods.Exercise;
public class Listing9_TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Maksimum 3 dan 4 adalah " + max (3,4));
        System.out.println("maksimum dari 3.0 dan 5.4 adalah" + max (3.0, 5.4));
        System.out.println("masuksimum daar 3.0, 5.4, dan 10.14 adalah " + max (3.0, 5.4, 10.14));
    }
    public static int max (int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return  num2;
    }
    public  static double max (double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return  num2;
    }
    public static double max (double  num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
