package Chapter12_ExceptionHandlingAndText_1or0.Exercise.Soal_12_05;

import java.util.Date;

public class GeometricObject {
    private String color =  " white";
    private boolean  filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return "create on " + dateCreated + "\nColor: " + color + "and filled: " + filled;
    }
}
