package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

public class Listing14_WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("score.txt");
        if (file.exists()){
        System.out.println("File already exist");
        System.exit(0);
        }
        try(
                java.io.PrintWriter output = new java.io.PrintWriter(file);
                ){
            output.print("John T Smith");
            output.print(90);
            output.print("Eric T jones");
            output.print(85);
        }
    }
}
