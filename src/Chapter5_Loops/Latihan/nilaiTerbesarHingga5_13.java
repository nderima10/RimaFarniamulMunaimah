package Chapter5_Loops.Latihan;

public class nilaiTerbesarHingga5_13 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n + 1, 3) < 12000) {
            n++;
            System.out.println("Bilangan bulat terbesar n sehingga n^3 kurang dari 12000 adalah : ");
        }
    }
}
