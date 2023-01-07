package Chapter3.Ujian;

import java.util.Scanner;

public class Ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total, total_bayar, total_case, kembalian, discon;
        String member;

        System.out.println("Apakah pelanggan termasuk member ? (iya/tidak)");
        member = input.nextLine();
        System.out.println("Masukan total belanja : ");
        total = input.nextDouble();

        double a = total * 0.03;
        double b = total * 0.02;

        discon = 0;
        switch(member){
            case "iya": System.out.println("Anda merukan : member");
                if(total >= 500000)
                    discon = a;
                else
                    discon = b;
                break;

            case "tidak": System.out.println("Anda merupakan : pelanggan biasa");
                if(total >= 500000)
                    discon = b;
                else
                    break;
        }
        total_bayar = total - discon;

        System.out.println("total belanja anda adalah : " + String.format("%.2f", total));
        if(discon == a)
            System.out.println("Selamat, anda mendapatkan potongan harga : " + String.format("%.2f", discon));
        if(discon == b)
            System.out.println("Selamat, anda mendapatkan potongan harga : " + String.format("%.2f", discon));

        System.out.println("Total bayar : " + String.format("%.2f", total_bayar));

        System.out.println("****** CASH SYSTEM ******");
        System.out.println("total cash : ");
        total_case = input.nextDouble();
        if(total_case <= total_bayar)
            System.out.println("Maaf jumlah yang anda bayarkan kurang");

        kembalian = total_case - total_bayar;
        System.out.println("kembalian anda : " + String.format("%.2f", kembalian));
    }
}
