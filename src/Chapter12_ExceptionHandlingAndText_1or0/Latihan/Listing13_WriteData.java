package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

public class Listing13_WriteData {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("score.txt");
        if (file.exists()){
            System.out.println("File already excise");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("john T smith ");
        output.print(90);
        output.print("Eric K jones ");
        output.print(85);
        output.close();
    }
}
