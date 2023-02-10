package Chapter7_SingelDimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Objects;

public class Soal23_GameLockerPuzzle {
    public static void main(String[] args) {
        String[] locker = new String[100];
        closeAllLockers(locker);
        studentLockerChanges(locker);
        print(locker);
    }
    public static boolean isOpen(String y) {
        return Objects.equals(y, "OPEN");
    }
    public static void closeAllLockers(String[] locker) {
        Arrays.fill(locker, "CLOSED");
    }
    public static void studentLockerChanges(String[] lockers) {
        for (int s = 1; s <= lockers.length; s++){
            for (int y = 0; y < lockers.length; y += s) {
                if (isOpen(lockers[y]))
                    lockers[y] = "COLSED";
                else
                    lockers[y] = "OPEN";
            }
        }
    }
    public static void print(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (isOpen(lockers[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}
