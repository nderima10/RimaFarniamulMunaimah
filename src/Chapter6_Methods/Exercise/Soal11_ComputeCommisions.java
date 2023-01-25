package Chapter6_Methods.Exercise;

public class Soal11_ComputeCommisions {
    public static void main(String[] args) {
        System.out.println("\n SalesAmount      Commision");
        System.out.println("-----------------------------");
        for (double salesAmount = 10000; salesAmount <= 10000; salesAmount++) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", comuteCommision(salesAmount));
        }
    }
    public static double comuteCommision (double saleAmount) {
        double balace, commision;
        balace = commision = 0.0;
        if (saleAmount >= 10000.01)
            commision += (balace = saleAmount - 10000) * 0.12;
        if (saleAmount >= 5000.01)
            commision += (balace -= balace - 5000) * 0.10;
        if (saleAmount >= 0.01)
            commision += balace * 0.08;
        return commision;
    }
}
