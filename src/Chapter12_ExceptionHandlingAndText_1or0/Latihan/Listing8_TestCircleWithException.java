package Chapter12_ExceptionHandlingAndText_1or0.Latihan;

public class Listing8_TestCircleWithException {
    public static void main(String[] args) {
        try {
            Listing7_CircleWithException c1 = new Listing7_CircleWithException(5);
            Listing7_CircleWithException c2 = new Listing7_CircleWithException(-5);
            Listing7_CircleWithException c3 = new Listing7_CircleWithException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of  object created: " + Listing7_CircleWithException.getNumberOfObjects());
    }
}
