package Chapter3_Selection.Ujian;

import java.util.Scanner;

public class Ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama bulan dalam bahasa indonesia : ");
        String bulan = input.nextLine();
        System.out.print("Masukan tahun : ");
        int tahun = input.nextInt();

        System.out.print("pada bulan " + bulan + " tahun " + tahun + " ada ");
        switch (bulan) {
            case "januari":
            case "maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                System.out.println("31 Hari,"); break ;
            case "April":
            case "Juni":
            case "September":
            case "November":
                System.out.println("30 Hari,"); break ;
            case "Februari":
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0))
                    System.out.println("29 Hari,");
                else
                    System.out.println("28 Hari,"); break ;
        }
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun ini merupakan tahun kabisat ");
        }else if ((tahun % 100 != 0 ) || (tahun % 400 == 0))
            System.out.println("Tahun ini bukan merupakan tahun kabisat ");
        else
            System.out.println("anda memasukan angka yang salah");
    }
}
