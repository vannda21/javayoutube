package oop;

public class Car extends Vehicle{
    private boolean powerSteering = false;
    private boolean ledScreen = true;

    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }
    public String getName(){
        return "Name of your vehicle is : " + super.getName();
    }
    public void setPowerSteering(boolean powerSteering){
        this.powerSteering = powerSteering;

    }
    public void setLedScreen(boolean ledScreen){
        this.ledScreen = ledScreen;
    }
    public boolean getPowerSteering(boolean powerSteering){
        return this.powerSteering;

    }
    public boolean getLedScreen(boolean ledScreen){
        return this.ledScreen;
    }
    public String getInfo(){
        return "this is a car";
    }

}
