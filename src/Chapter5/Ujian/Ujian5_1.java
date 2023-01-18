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
            case 1:
                System.out.println("konversi bilangan biner ke oktal");
                System.out.print("Masukan bilangan biner : ");
                long biner = input.nextLong();
                int oktal = 0, desimal = 0, a = 0;
                while (biner != 0) {
                    desimal += (biner % 10) * Math.pow(2, a);
                    a++;
                    biner /= 10;
                }
                a = 1;
                while (desimal != 0) {
                    oktal += (desimal % 8) * a;
                    desimal /= 8;
                    a *= 10;
                }
                System.out.println("Konversi bilangan oktalnya adalah : " + oktal);
                break;
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
            case 4:
                System.out.println("konversi bilangan oktal ke biner");
                System.out.print("Masukan bilangan oktal : ");
                long oktal3 = input.nextLong();
                int biner4 = 0, desimal4 = 0, w = 0;
                while (oktal3 != 0) {
                    desimal4 += (oktal3 % 10) * Math.pow(8, w);
                    w++;
                    oktal3 /= 10;
                }
                w = 1;
                while (desimal4 != 0) {
                    biner4 += (desimal4 % 2) * w;
                    desimal4 /= 2;
                    w *= 10;
                }
                System.out.println("Konversi bilangan oktalnya adalah : " + biner4);
                break;
            case 5:
                System.out.println("konversi bilangan oktal ke desimal");
                System.out.print("Masukan bilangan oktal : ");
                int oktal5 = input.nextInt();
                int result = 0;
                int copy_oktal = oktal5;
                for (int d = 0; copy_oktal > 0; d++) {
                    int temp = copy_oktal % 10;
                    double p = Math.pow(8, d);
                    result += (temp * p);
                    copy_oktal = copy_oktal / 10;
                }
                System.out.print("Konversi desimalnya adalah : " + result);
                break;
            case 6:
                System.out.println("konversi bilangan oktal ke heksa");
                int oktal0;
                Scanner in = new Scanner(System.in);
                System.out.print("Masukan bilangan oktal : ");

                oktal0 = Integer.parseInt(in.nextLine(), 8);
                String hexa1 = Integer.toHexString(oktal0);
                System.out.println("Bilangan Hexadecimalnya adalah: " + hexa1);
                break;
            case 7:
                System.out.println("konversi bilangan desimal ke biner");
                System.out.print("Masukan bilangan desimal : ");
                int desimal3 = input.nextInt();

                String biner2 = "";
                for (i = desimal3; i > 0; i /= 2) {
                    biner2 = (i % 2) + biner2;
                }
                System.out.println("konversi bilangan binernya adalah : " + biner2);
                break;
            case 8:
                System.out.println("konversi bilangan desimal ke oktal");
                System.out.print("Masukan bilangan desimal : ");
                int decimal2 = input.nextInt();

                String oktali = "";
                for (i = decimal2; i > 0; i /= 8) {
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
            case 10:
                System.out.println("konversi bilangan heksa ke biner");
                int d = 0, len;
                String hexadecimal;
                Scanner s = new Scanner(System.in);
                System.out.print("Masukan bilangan heksa : ");
                hexadecimal = s.nextLine();
                len = hexadecimal.length();
                char[] hexDigit = hexadecimal.toCharArray();
                while (d < len) {
                    switch (hexDigit[d]) {
                        case '0' -> System.out.print("Konversi bilangan binernya adalah : 0000");
                        case '1' -> System.out.print("Konversi bilangan binernya adalah : 0001");
                        case '2' -> System.out.print("Konversi bilangan binernya adalah : 0010");
                        case '3' -> System.out.print("Konversi bilangan binernya adalah : 0011");
                        case '4' -> System.out.print("Konversi bilangan binernya adalah : 0100");
                        case '5' -> System.out.print("Konversi bilangan binernya adalah : 0101");
                        case '6' -> System.out.print("Konversi bilangan binernya adalah : 0110");
                        case '7' -> System.out.print("Konversi bilangan binernya adalah : 0111");
                        case '8' -> System.out.print("Konversi bilangan binernya adalah : 1000");
                        case '9' -> System.out.print("Konversi bilangan binernya adalah : 1001");
                        case 'a', 'A' -> System.out.print("Konversi bilangan binernya adalah : 1010");
                        case 'b', 'B' -> System.out.print("Konversi bilangan binernya adalah : 1011");
                        case 'c', 'C' -> System.out.print("Konversi bilangan binernya adalah : 1100");
                        case 'd', 'D' -> System.out.print("Konversi bilangan binernya adalah : 1101");
                        case 'e', 'E' -> System.out.print("Konversi bilangan binernya adalah : 1110");
                        case 'f', 'F' -> System.out.print("Konversi bilangan binernya adalah : 1111");
                        default -> System.out.println("\nBilangan hexa tidak tersedia!");
                    }
                    d++;
                }
                break;
            case 11:
                System.out.println("konversi bilangan heksa ke oktal");
                int b = 0, oct;
                String hexadecimal1;
                Scanner f = new Scanner(System.in);
                System.out.print("Masukan bilangan heksa : ");
                hexadecimal1 = f.nextLine();
                oct = hexadecimal1.length();
                char[] hexDigit1 = hexadecimal1.toCharArray();
                while (b < oct) {
                    switch (hexDigit1[b]) {
                        case '0' -> System.out.print("Konversi bilangan oktalnya adalah : 0");
                        case '1' -> System.out.print("Konversi bilangan oktalnya adalah : 1");
                        case '2' -> System.out.print("Konversi bilangan oktalnya adalah : 2");
                        case '3' -> System.out.print("Konversi bilangan oktalnya adalah : 3");
                        case '4' -> System.out.print("Konversi bilangan oktalnya adalah : 4");
                        case '5' -> System.out.print("Konversi bilangan oktalnya adalah : 5");
                        case '6' -> System.out.print("Konversi bilangan oktalnya adalah : 6");
                        case '7' -> System.out.print("Konversi bilangan oktalnya adalah : 7");
                        case '8' -> System.out.print("Konversi bilangan oktalnya adalah : 10");
                        case '9' -> System.out.print("Konversi bilangan oktalnya adalah : 11");
                        case 'a', 'A' -> System.out.print("Konversi bilangan oktalnya adalah : 12");
                        case 'b', 'B' -> System.out.print("Konversi bilangan oktalnya adalah : 13");
                        case 'c', 'C' -> System.out.print("Konversi bilangan oktalnya adalah : 14");
                        case 'd', 'D' -> System.out.print("Konversi bilangan oktalnya adalah : 15");
                        case 'e', 'E' -> System.out.print("Konversi bilangan oktalnya adalah : 16");
                        case 'f', 'F' -> System.out.print("Konversi bilangan oktalnya adalah : 17");
                        default -> System.out.println("\nBilangan hexa tidak tersedia!");
                    }
                    b++;
                }
                break;
          case 12 :
              System.out.println("konversi bilangan heksa ke desimal");
              System.out.print("Masukan bilangan heksa : " );
              String hex = input.next();
              if (hex.length() != 0) {
                  System.out.println();
                  System.exit(0);
              }
              char ch1 = hex.charAt(0);
              if (ch1 <= 'F' && ch1 >= 'A') {
                  int v = ch1 - 'A' + 10;
                  System.out.println("Kinversi bilangan desimalnya" + ch1 + " adalah " + v);
              } else if (Character.isDigit(ch1)) {
                  System.out.println("Kinversi bilangan desimalnya " + ch1 + " adalah " + ch1);
              }
              else {
                  System.out.println("Bilangan hexa tidak tersedia");break;
              }
        }
    }
}




