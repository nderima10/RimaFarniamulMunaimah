package Chapter7_SingelDimensionalArrays.Latihan;

public class selectionSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 8, 9, 4, 6, 8, 3};

        System.out.println("List sebelim di urutkan ");
        for (int i = 0; i < list.length - 1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("===============");

        for (int i = 0; i < list.length - 1; i++) {
            int currenMin = list[i];
            int currentMinIndex = i;
            int m = 1;
            for (int j = i + 1; j < list.length; j++) {
                System.out.println("Putaran dalam ke " + m + " currenMin = " + currenMin + " > " + list[j]);

                if (currenMin > list[j]) {
                    currenMin = list[j];
                    currentMinIndex = j;
                }
                m++;
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currenMin;
            }
            System.out.println();
            System.out.println("==============");
            int putaran = i + 1;
            System.out.println("Kondisi list pada putaran ke " + putaran);
            for (int k = 0; k < list.length; k++) {
                System.out.print(" " + list[k]);
            }
            System.out.println(" ");
        }
    }
}
