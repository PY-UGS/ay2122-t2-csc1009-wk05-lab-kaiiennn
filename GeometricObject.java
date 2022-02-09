package week5lab;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;

    public GeometricObject(){

    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        long millis = System.currentTimeMillis();
        dateCreated = new Date(millis);
        return this.dateCreated;
    }

    public String toString(){
        return "created on " + this.getDateCreated() + "\n" + "color: " + this.getColor() + " and filled: " + this.isFilled();
    }

}
