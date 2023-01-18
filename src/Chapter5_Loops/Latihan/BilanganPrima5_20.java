package Chapter5_Loops.Latihan;

public class BilanganPrima5_20 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 8;
        int count = 0;

        System.out.println("Bilangan prima antara 2 dan 1.000, termasuk \n");

        for (int nomor = 2; nomor <= 1000; nomor++) {
            boolean primer = true;
            for (int bagi = 2; bagi <= nomor / 2; bagi++) {
                if (nomor % bagi == 0) {
                    primer = false;
                    break;
                }
            }
            if (primer) {
                count++;

                if (count % NUMBER_PER_LINE == 0) {
                    System.out.println(nomor);
                }
                else
                    System.out.println(nomor + " ");
            }
        }
    }
}
