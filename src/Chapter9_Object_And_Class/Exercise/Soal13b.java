package Chapter9_Object_And_Class.Exercise;

public class Soal13b {
    int row;
    int column;
    double maxValue;

    Soal13b(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }
}
