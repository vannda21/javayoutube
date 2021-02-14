package oop;

public class Bike extends Vehicle{
    private boolean fourStroke = true;

    public Bike(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){
       super(name, color ,model, company,company);
    }
    public void setFourStroke(boolean fourStroke){
        this.fourStroke = fourStroke;
    }
    public boolean getFourStroke(){
        return this.fourStroke;
    }
    public String getInfo(){
        return "this is a Bike";
    }

}
