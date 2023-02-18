package Chapter8_MultidimensionalArray.Exercise;

public class Soal4_ComputeTheWeeklyHoursForEachEmployee {
    public static void main(String[] args) {
        int[][] weeklyHours = { {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},};
int[][] totalHours = sumRows(weeklyHours);
sort(totalHours);
print(totalHours);
    }
    public static int[][] sumRows(int[][] m) {
        int[][] totals = new int[m.length][2];

        for (int row = 0; row < m.length; row++) {
            totals[row][0] = row;
            totals[row][1] = 0;
            for (int col = 0; col < m[row].length; col++) {
                totals[row][1] += m[row][col];
            }
        }
        return totals;
    }
    public static void sort(int[][]m) {
        for (int i = 0; i < m.length; i++) {
            int maxCol0 = m[i][0];
            int maxcol1 = m[i][1];
            int maxIndex = i;

            for (int j = i + 1; j < m.length; j++){
                if (maxcol1 < m[j][1]) {
                    maxcol1 = m[j][0];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                m[maxIndex][1] = m[i][1];
                m[maxIndex][0] = m[i][0];
                m[i][1] = maxcol1;
                m[i][0] = maxCol0;
            }
        }
    }
    public static void print(int[][] m){
        System.out.println("Employee    Weekly Hourse");
        System.out.println("-------------------------");
        for (int row = 0; row < m.length; row++) {
//            System.out.printf("%4d%16d\n", m[row][0], totalhours[row][1]);
        }
    }
}
