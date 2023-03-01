package Chapter10_ObjectOrientedThingking.Latihan;

import java.math.BigInteger;
import java.util.Scanner;

public class Listing9_LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n +"! is \n" + facatorial(n));
    }
    public static BigInteger facatorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i <= n; i++)
            result = result.multiply(new BigInteger(i + " "));

        return result;
    }
}
