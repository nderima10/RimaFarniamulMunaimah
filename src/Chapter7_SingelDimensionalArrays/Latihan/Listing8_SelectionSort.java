package Chapter7_SingelDimensionalArrays.Latihan;

public class Listing8_SelectionSort {
    public static void selection(double[] list) {
        for (int  i = 0; i < list.length - 1; i++) {
            double currenMin = list[i];
            int currenMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currenMin > list[j]) {
                    currenMin = list[j];
                    currenMinIndex = j;
                }
            }
            if (currenMinIndex != i) {
                list[currenMinIndex] = list[i];
                list[i] = currenMin;
            }
        }
    }
}
