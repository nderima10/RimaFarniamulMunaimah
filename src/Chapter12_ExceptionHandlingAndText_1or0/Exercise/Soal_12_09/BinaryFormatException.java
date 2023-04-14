package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_09;

public class BinaryFormatException extends NumberFormatException{
    private String binaryString;
    public BinaryFormatException(String binaryString){
        super(binaryString + " is not a binary string");
        this.binaryString = binaryString;
    }
    public String getBinaryString(){
        return binaryString;
    }
}
