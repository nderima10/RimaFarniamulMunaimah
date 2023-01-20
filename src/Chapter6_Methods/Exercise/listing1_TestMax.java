package Chapter6_Methods.Exercise;

public class listing1_TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("Nilai maksimum dari " + i + " dan " + j + " adalah " + k);
    }
    public static int max(int i, int j) {
        int result;
        if (i > j)
            result = i;
        else
            result = j;
        return result;
    }
}
