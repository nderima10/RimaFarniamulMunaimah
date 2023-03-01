package Chapter9_Object_And_Class.Exercise;

public class Soal6_StopWatch {
    public static void main(String[] args) {
        Soal6_StopWatch stopwatch = new Soal6_StopWatch();
        int[] randomArray = getArray();
//        stopwatch.start();
//        selectionSort(randomArray);
//        stopwatch.stop();
//
//        System.out.println("The execution time of sorting 100,000 " +
//                "number using selection sort: " + stopwatch.getElapsedTime() +
//                "millisecond");
    }

    public static int[] getArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minindex = i;

            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minindex = j;
                }
            }
            if (i != minindex) {
                array[minindex] = array[i];
                array[i] = minindex;
            }
        }
    }
}
