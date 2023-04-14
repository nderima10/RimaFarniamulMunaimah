package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_08;

public class HexFormatException extends NumberFormatException{
    private String hex;
    public HexFormatException(String hex){
        super(hex + "Is not a hex string");
        this.hex = hex;
    }
    public String getHex(){
        return hex;
    }
}
