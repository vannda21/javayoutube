package oop;

public class Vehicle {
    private String name;
    private String colors = "";
    private String model;
    private String company;
    private String engine = "800";
    public static int count = 0;

    public Vehicle(){
        count++;
    }
    public Vehicle(String name, String colors,String model, String company, String engine ){
        this.name = name;
        this.colors = colors;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColors(String colors){
        this.colors = colors;
    }
    public void setModel(String model) {

        this.model = model;
    }
    public void setCompany(String company){

        this.company = company;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getName(){
        return this.name;
    }
    public String getColors(){
        return this.colors;
    }
    public String getModel(){
        return this.model;
    }
    public String getCompany(){
        return  this.company;
    }
    private String getEngine(){
        return  this.engine;
    }

    public int getSpeed() {
        String a = getEngine();
        if(a == "800"){
            return 90;
        }else{
            return 120;
        }
    }
    public String getInfo(){
        return "this is a vehicle";
    }

    public static String  getVehicle(){
        return "You have set the Name and Color of that vehicle";
    }
}
