package Chapter5.Ujian;

import java.util.Scanner;

public class Ujian5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mengkonversi bilangan Biner ");
        System.out.println("------------Menu------------\n");
        System.out.println("1. Konversi bilangan biner ke oktal");
        System.out.println("2. Konversi bilangan biner ke desimal");
        System.out.println("3. Konversi bilangan biner ke heksa");
        System.out.println("4. Konversi bilangan oktal ke biner");
        System.out.println("5. Konversi bilangan oktal ke desimal");
        System.out.println("6. Konversi bilangan oktal ke heksa");
        System.out.println("7. Konversi bilangan desimal ke biner");
        System.out.println("8. Konversi bilangan desimal ke oktal");
        System.out.println("9. Konversi bilangan desimal ke heksa");
        System.out.println("10. Konversi bilangan heksa ke biner");
        System.out.println("11. Konversi bilangan heksa ke oktal");
        System.out.println("12. Konversi bilangan heksa ke desimal");

        System.out.print("Masukan nomor MENU : ");
        int MENU = input.nextInt();

        switch (MENU) {
//            case 1 :
//                System.out.println("konversi bilangan biner ke oktal");
//                System.out.print("Masukan bilangan biner : ");
//
//                System.out.println("Konversi bilangan oktalnya adalah : ");
//                break;
            case 2:
                System.out.println("konversi bilangan biner ke desimal");
                System.out.print("Masukan bilangan biner : ");
                int binerDesimal = input.nextInt();
                int desimalNomor = 0, i = 0;
                while (binerDesimal > 0) {
                    desimalNomor += Math.pow(2, i++) * (binerDesimal % 10);
                    binerDesimal /= 10;
                }
                System.out.println("konversi bilangan desimalnya adalah : " + desimalNomor);
                break;
            case 3:
                System.out.println("konversi bilangan biner ke heksa");
                int biner3;
                Scanner scan = new Scanner(System.in);
                System.out.print("Masukan bilangan biner : ");

                biner3 = Integer.parseInt(scan.nextLine(), 2);
                String hexa = Integer.toHexString(biner3);
                System.out.println("Bilangan Hexadecimalnya adalah: " + hexa);
                break;
//            case 4 :
//                System.out.println("konversi bilangan oktal ke biner");
//                System.out.print("Masukan bilangan oktal : ");
//                int oktal1 = input.nextInt();
//
//                String biner4 = "";
//                for (int i = oktal1; i > 2; i /= 8) {
//                    biner4 = (i % 8) + biner4;
//                }
//                System.out.println("konversi bilangan binernya adalah : " + biner4);
//                break;
//            case 5 :
//                System.out.println("konversi bilangan oktal ke desimal");
//                System.out.print("Masukan bilangan oktal : ");
//                int oktal5 = input.nextInt();
//
//                String desimal = "";
//                for (int i = oktal5; i > 8; i /= 10) {
//                    desimal = i % 10 + desimal;
//                }
//                System.out.println("Konversi bilangan desimalnya adalah : " + desimal);
//                break;
//            case 6 :
//                System.out.println("konversi bilangan oktal ke heksa");
//                int num2;
//                Scanner scan2 = new Scanner(System.in);
//                System.out.print("Masukan bilangan oktal : ");
//                num2 = Integer.parseInt(scan2.nextLine(), 8);
//                String hexa2 = Integer.toHexString(num2);
//                System.out.println("Bilangan Hexanya adalah: " + hexa2);
//                break;
            case 7:
                System.out.println("konversi bilangan desimal ke biner");
                System.out.print("Masukan bilangan desimal : ");
                int desimal = input.nextInt();

                String biner = "";
                for (i = desimal; i > 0; i /= 2) {
                    biner = (i % 2) + biner;
                }
                System.out.println("konversi bilangan binernya adalah : " + biner);
                break;
            case 8:
                System.out.println("konversi bilangan desimal ke oktal");
                System.out.print("Masukan bilangan desimal : ");
                int decimal = input.nextInt();

                String oktali = "";
                for (i = decimal; i > 0; i /= 8) {
                    oktali = i % 8 + oktali;
                }
                System.out.println("konversi bilangan oktalnya adalah : " + oktali);
                break;
            case 9:
                System.out.println("konversi bilangan desimal ke heksa");
                int num3;
                Scanner scan3 = new Scanner(System.in);
                System.out.print("Masukan bilangan desimal : ");
                num3 = Integer.parseInt(scan3.nextLine(), 10);
                String hexa3 = Integer.toHexString(num3);
                System.out.println("Bilangan Hexanya adalah: " + hexa3);
                break;
////            case 10 :
////                System.out.println("konversi bilangan heksa ke biner");
////                System.out.print("Masukan bilangan heksa : ");
////                String heksa = input.nextLine();
////                int nilaiBiner = Integer.
//            case 11:
//                System.out.println("konversi bilangan heksa ke oktal");
//                System.out.print("Masukan bilangan heksa : ");
//
//                System.out.println("Konversi bilangan oktalnya adalah : ");
//                break;
//            case 12 :
//                System.out.println("konversi bilangan heksa ke desimal");
//                System.out.print("Masukan bilangan heksa : ");
//                int heksa1 = input.nextInt();
//                String desimal = "";
//                for (int i = heksa1; i > 16; i /= 10) {
//                    desimal = 0.i % 10 + desimal;
//                }
//                System.out.println("Konversi bilangannya adalah : " + desimal);
        }
    }
}

