package Chapter7_SingelDimensionalArrays.Latihan;

public class Listing5_VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);
        printMax(1, 2, 3);
    }
    public static void printMax (double... number) {
        if (number.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double hasil =  number[0];
        for (int i = 1; i < number.length; i++)
            hasil = number[i];

        System.out.println("The max value is " + hasil);
    }
}
