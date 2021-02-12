package oop;

public class main {
    public static void main(String[] args){
        System.out.println("Hello fcking java");
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.colors);

        Vehicle vehicle1 = new Vehicle("Civic","black", "Honda","Honda");
        System.out.println(vehicle1.company);
    }
}
