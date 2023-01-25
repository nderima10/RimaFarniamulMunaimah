package Chapter5_Loops.Exercise;

public class EmpatPolaPakaiLoop {
    public static void main(String[] args) {
        System.out.println("Pola A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        int numberOfLines = 6;
        System.out.println("Pattern C");
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        System.out.println("Pattern D");
        for (int rows = 0; rows < 6; rows++) {				// Print rows
            for (int ws = 0; ws < rows; ws++) {				// Print white space
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - rows; col++) {	// Print numbers
                System.out.print((col + 1) + " ");
            }
            System.out.println();								// Print newline
        }
    }
}
