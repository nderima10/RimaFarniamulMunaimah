package Chapter7_SingelDimensionalArrays.Exercise;

public class Soal16_ExecutionTime {
    static final int SIZE = 10000;

    public static void main(String[] args) {
        int[] number = new int[SIZE];
        int key = (int) (Math.random() * SIZE);
        for (int i = 0; i < SIZE; i++) {
            number[i] = (int) (Math.random() * SIZE);
        }
        long start;
        int index = linearSearch(number, key);
        long finalTime = System.currentTimeMillis();
        System.out.println("LinearSearch - Total time of earch is: " + finalTime + " index = " + index);

        start = System.currentTimeMillis();
        System.out.println("Sorting array...");
        sort(number);
        System.out.println("Finished sosrting.");
        int index2 = binarySearch(number, key);
        finalTime = System.currentTimeMillis() - start;
        System.out.println("Binary - Total time of search is: " + finalTime + " index " + index2);
    }
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int swapIndex = i;
            int low = numbers[i];
            for (int k = 0; k < numbers.length; k++) {
                if (low > numbers[k]) {
                    low = numbers[k];
                    swapIndex = k;
                }
            }
            if (swapIndex != i) {
                numbers[swapIndex] = numbers[i];
                numbers[i] = low;
            }
        }
    }
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key)
                return i;
         }
    return -1;
    }
    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > numbers[mid]) {
                low = mid + 1;
            } else if (key == numbers[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -low - 1;
    }
}
