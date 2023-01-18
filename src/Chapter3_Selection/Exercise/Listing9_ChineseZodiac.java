package Chapter3_Selection.Exercise;

import java.util.Scanner;

public class Listing9_ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12) {
            case 0: System.out.println("Monyet= jahil,licik, dan kurang bertanggung jawab ");break;
            case 1: System.out.println("Ayam jantan= giat bekerja dan selalu pasti mengenai keputusan mereka.");break;
            case 2: System.out.println("Anjing= dilambangkan sebagai kecerdasan dan kesetiaan");break;
            case 3: System.out.println("Babi= jujur ​​​​​dan tidak memiliki tipu daya");break;
            case 4: System.out.println("Tikus= kebijaksanaan, kekayaan dan kemakmuran");break;
            case 5: System.out.println("ox= punya hasrat untuk memegang kendali dalam lingkungan");break;
            case 6: System.out.println("Singa= memiliki kepribadian yang rileks namun punya rasa percaya diri yang besar");break;
            case 7: System.out.println("Kelinci= hangat, pendiam, dan cinta damai");break;
            case 8: System.out.println("Naga= Berbakat dengan keberanian, keuletan, dan kecerdasan bawaan");break;
            case 9: System.out.println("Ular= selalu curiga, pendusta, pemanipulatif, berbahaya, licik, dan posesif.");break;
            case 10: System.out.println("kuda= sangat suka traveling, belajar hal dan bertemu orang baru");break;
            case 11: System.out.println("Kambing= lembut, penuh perhatian, jujur, dan baik hati");break;
        }
    }
}
