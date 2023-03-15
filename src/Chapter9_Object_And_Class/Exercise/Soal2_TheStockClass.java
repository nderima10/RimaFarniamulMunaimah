package Chapter9_Object_And_Class.Exercise;

public class Soal2_TheStockClass {
    public static void main(String[] args) {
        soal2b_Stock stock = new soal2b_Stock("ORCL", " Oracle Corporation");
        stock.previousclosingPrice =34.5;
        stock.currentPrice = 34.35;

        System.out.println("\nStock name    : " + stock.name);
        System.out.println("\nStock symbol  : " + stock.Symbol);
        System.out.printf("Persentase perubahan harga: %.2f%%\n", stock.getChangePercent());

    }
}
