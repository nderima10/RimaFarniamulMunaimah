package Chapter5_Loops.Latihan;

public class Listing13_TestContinue {
    public static void main(String[] args) {
        int sum  = 0;
        int nomor  = 0;
        while (nomor < 20) {
            nomor++;
            if (nomor == 10 || nomor == 11)
                continue;
            sum += nomor;
        }
        System.out.println("The sum is " + sum);
    }
}
