package Chapter6_Methods.Exercise;

import java.util.Arrays;

public class MengurutkanAngka {
    public static void main(String[] args) {
      int [] array = {2,7,4,10,6,3,8};
      Arrays.sort(array);
      for (int nilai : array) {
          System.out.println(nilai);
      }
    }
}
