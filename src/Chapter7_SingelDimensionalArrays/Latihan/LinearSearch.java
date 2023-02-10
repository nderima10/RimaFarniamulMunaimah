package Chapter7_SingelDimensionalArrays.Latihan;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {3,4,5,6,8,5,9};
        int key = 4;

        for (int i = 0; i < list.length; i++){
            if (key == list[i]) {
                System.out.println("list[" + i + "] = " + list[i] + " key = " + key + " data ditemukan");
                continue;
            }
            System.out.println("list[" + i + "] = " + list[i] + " key = " + key);
        }
    }
}
