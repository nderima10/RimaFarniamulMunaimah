package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Scanner;

public class Soal17_SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        String[] student = new String[input.nextInt()];
        int[] skor = new int[student.length];

        System.out.print(" Enter the name a score for each student ");
        for (int i = 0; i < student.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            student[i] = input.next();
            System.out.print("Score : ");
            skor[i] = input.nextInt();
        }
//        sortDecreasinng(student, skor);
//        for (String e: student) {
//            System.out.println(e);
        }
    }
//    public static void sortDecreasinng(String[] strs, int[] num) {
//        for (int i = 0; i < num.length; i++) {
//            int max = num[i];
//            int maxIndex = i;
//            String temp;
//            for (int j = i + 1; j < num.length; j++) {
//                if (num[j] > max) {
//                    max = num[j];
//                    maxIndex = j;
//                }
//            }
//            if (maxIndex != i) {
//                temp = strs[i];
//                strs[i] = strs[maxIndex];
//                strs[maxIndex] = temp;
//
//                num[maxIndex] = num[i];
//                num[i] = max;
//            }
//        }
//    }

