package Chapter6_Methods.Ujian;

import java.util.Scanner;

public class Ujian6_3 {
    public static void main(String[] args) {

        String masuk = null, keluar = null, hasilAkhir = null, nomor = null;
        int menu = MENU();

        switch (menu) {
            case 1 : {
                masuk = "Biner";
                keluar = "Oktal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 2 : {
                masuk = "Biner";
                keluar = "Desimal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 3 : {
                masuk = "Biner";
                keluar = "Heksa";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 4 : {
                masuk = "Oktal";
                keluar = "Biner";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 5 : {
                masuk = "Oktal";
                keluar = "Desimal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 6 : {
                masuk = "Oktal";
                keluar = "Heksa";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 7 : {
                masuk = "Desimal";
                keluar = "Biner";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 8 : {
                masuk = "Desimal";
                keluar = "Oktal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 9 : {
                masuk = "Desimal";
                keluar = "Heksa";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
            }
            case 10 : {
                masuk = "Heksa";
                keluar = "Biner";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 11 : {
                masuk = "Heksa";
                keluar = "Oktal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
                break;
            }
            case 12 : {
                masuk = "Biner";
                keluar = "Desimal";

                nomor = inputNomor(masuk,keluar);
                boolean hasil = cekInput(nomor,masuk);
                konversiNomor (hasil,nomor,masuk,keluar);
            }
        }
        assert false;
        if (hasilAkhir.equals("Error")) {
            System.out.println("Bilangan yang anda masukan salah!");
        }else {
            System.out.println(nomor.toLowerCase() + " dalam " + masuk + " adalah " + hasilAkhir.toLowerCase() + " dalam " + keluar);
        }
    }
    public static int MENU() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Mengkonversi bilangan ");
        System.out.println("=============== Menu ===============\n");
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
        System.out.println(" ");
        System.out.print("Masukan menu yang akan dikonversi : ");
        return input.nextInt();
    }

    private static String inputNomor(String masuk, String keluar) {
        Scanner input = new Scanner(System.in);
        String  nomor;
        System.out.println(masuk + " ke " + keluar);
        System.out.print("Masukan " + masuk + " Nomor : ");
        nomor = input.next();
        return nomor;
    }

    private static String konversiNomor(boolean hasil, String nomor, String masuk, String keluar) {
        String hasilAkhir;
        if (hasil) {
            if (masuk.equals("Biner") && keluar.equals("Oktal")) {
                hasilAkhir = (binerToOktal(nomor));
            } else if (masuk.equals("Biner") && keluar.equals("Desimal")) {
                hasilAkhir = String.valueOf(binerToDesimal(nomor));
            } else if (masuk.equals("Biner") && keluar.equals("Heksa")) {
                hasilAkhir = (binerToHeksa(nomor));
            } else if (masuk.equals("Oktal") && keluar.equals("Biner")) {
                hasilAkhir = (oktalToBiner(nomor));
            } else if (masuk.equals("Oktal") && keluar.equals("Desimal")) {
                hasilAkhir = (oktalToDesimal(nomor));
            } else if (masuk.equals("Oktal") && keluar.equals("Heksa")) {
                hasilAkhir = (oktalToHeksa(nomor));
            } else if (masuk.equals("Desimal") && keluar.equals("Biner")) {
                hasilAkhir = (desimalToBiner(nomor));
            } else if (masuk.equals("Desimal") && keluar.equals("Oktal")) {
                hasilAkhir = (desimalToOktal(nomor));
            } else if (masuk.equals("Desimal") && keluar.equals("Heksa")) {
                hasilAkhir = (desimalToHeksa(nomor));
            } else if (masuk.equals("Heksa") && keluar.equals("Biner")) {
                hasilAkhir = String.valueOf(heksaToBiner(nomor));
            } else if (masuk.equals("Heksa") && keluar.equals("Oktal")) {
                hasilAkhir = (heksaToOktal(nomor));
            } else if (masuk.equals("Heksa") && keluar.equals("Desimal")) {
                hasilAkhir = (heksaToDesimal(nomor));
            } else {
                hasilAkhir = "Error";
            }
        } else {
            hasilAkhir = "Error";
        }
        return hasilAkhir;
    }
    private static boolean cekInput(String nomor, String cek) {
        switch (cek){
            case "Biner" -> {
                return nomor.matches("[01]+");
            }
            case "Desimal" -> {
                return nomor.matches("-?");
            }
            case "Heksadesimal" -> {
                return nomor.matches("^[0-9a-fA-F]+$");
            }
            case "Oktal" -> {
                return nomor.matches("^[0-7]+$");
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + cek);
        }
    }
    public static String binerToOktal(String nomor) {
        int desimal = Integer.parseInt(String.valueOf(nomor), 2);
        return Integer.toOctalString(desimal);
    }
    public static int binerToDesimal(String nomor) {
        return Integer.parseInt(String.valueOf(nomor), 2);
    }
    public static String binerToHeksa(String nomor) {
        int desimal = Integer.parseInt(String.valueOf(nomor), 2);
        return Integer.toHexString(desimal);
    }
    public static String oktalToBiner(String nomor) {
        StringBuilder biner = new StringBuilder();
        for (int i = 0; i < nomor.length(); i++) {
            int digit = nomor.charAt(i) - '0';
            StringBuilder bin = new StringBuilder();
            for (int y = 0; y < 3; y++) {
                bin.insert(0, (digit & 1));
                digit = digit >> 1;
            }
            biner.append(bin);
        }
        return biner.toString();
    }
    public static String oktalToDesimal(String nomor) {
        StringBuilder desimal = new StringBuilder();
        for (int i = 0; i < nomor.length(); i++) {
            char c = nomor.charAt(i);
            int digit = c - '0';
            desimal.append(digit * Math.pow(8, nomor.length() - i - 1));
        }return desimal.toString();
    }
    public static String oktalToHeksa(String nomor) {
        int desimal = 0;
        for (int i = 0; i < nomor.length(); i++) {
            char c = nomor.charAt(i);
            int digit = c - '0';
            desimal += digit * Math.pow(8, nomor.length() - i - 1);
        }
        StringBuilder heksa = new StringBuilder();
        char[] heksaChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (desimal > 0) {
            long t = desimal % 16;
            heksa.insert(0, heksaChar[(int) t]);
            desimal = desimal / 16;
        }
        return heksa.toString();
    }
    public static String desimalToBiner(String nomor) {
        int desimal = Integer.parseInt(nomor);
        StringBuilder biner = new StringBuilder();
        while (desimal > 0 ) {
            long a = desimal % 2;
            biner.insert(0, a);
            desimal = desimal / 2;
        }
        return biner.toString();
    }
    public static String desimalToOktal(String nomor) {
        int desimal = Integer.parseInt(nomor);
        return Integer.toOctalString(desimal);
    }
    public static String desimalToHeksa(String nomor) {
        int desimal = Integer.parseInt(nomor);
        return Integer.toHexString(desimal);
    }
    public static String heksaToBiner(String nomor) {
        nomor = nomor.toUpperCase();
        StringBuilder biner = new StringBuilder();
        for (int i  = 0; i < nomor.length(); i++) {
            char c = nomor.charAt(i);
            switch (c) {
                case '0' : biner.append("0000");
                case '2' : biner.append("0001");
                case '3' : biner.append("0010");
                case '4' : biner.append("0100");
                case '5' : biner.append("0101");
                case '6' : biner.append("0110");
                case '7' : biner.append("0111");
                case '8' : biner.append("1000");
                case '9' : biner.append("1001");
                case 'A' : biner.append("1010");
                case 'B' : biner.append("1011");
                case 'C' : biner.append("1100");
                case 'D' : biner.append("1101");
                case 'E' : biner.append("1110");
                case 'F' : biner.append("1111");
            }
        }
        return String.valueOf(biner);
    }
    public static String heksaToOktal(String nomor) {
        int desimal = 0;
        nomor = nomor.toUpperCase();
        for (int i = 0; i < nomor.length(); i++){
            char c = nomor.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid heksadesimal digit : " + c);
            }
            desimal += digit * Math.pow(16, nomor.length() - i - 1);
        }
        StringBuilder oktal = new StringBuilder();
        while (desimal > 0) {
            oktal.insert(0, (desimal & 7));
            desimal = desimal >> 3;
        }
        return oktal.toString();
    }
    public static String heksaToDesimal(String nomor) {
        nomor = nomor.toUpperCase();
        int desimal = 0;
        for (int i = 0; i < nomor.length(); i++) {
            char c = nomor.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("invalid heksa digit : " + c);
            }
            desimal += digit * Math.pow(16, nomor.length() - i - 1);
        }
        return String.valueOf(desimal);
    }
}
