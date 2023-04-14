package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_10;

public class OutOfMemoryErrors {
    public static void main(String[] args) {
        int length = 1200000000;
        try {
            byte[] array  = new byte[length];
        }
        catch (OutOfMemoryError e){
            System.out.println(e.getMessage());
        }
        System.err.println("Error handled program continues...");
    }
}
