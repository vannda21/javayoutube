package oop;

public class main {
    public static void main(String[] args){
//        System.out.println("Hello fucking java");
//        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.count);
//
//        Vehicle vehicle1 = new Vehicle("Civic","black", "Honda","Honda","1000");
//        System.out.println(vehicle1.getColors());
//        vehicle1.setColors("green");
//        System.out.println(vehicle1.getColors());
//        System.out.println(vehicle1.getSpeed());
//        System.out.println(vehicle.count);
//
////        System.out.println(Vehicle.getVehicle());
//        Car car1 = new Car("civic","black","2012","honda","900",false,true);
////        System.out.println(car1.setLedScreen());
//        System.out.println(car1.getName());

        Vehicle vehicle1 = new Vehicle("Civic","black", "Honda","Honda","1000");
        System.out.println(vehicle1.getInfo());

        Vehicle vehicle2 = new Car("Civic","black", "Honda","Honda","1000",true,false);
        System.out.println(vehicle2.getInfo());

        Vehicle vehicle3 = new Bike("Civic","black", "Honda","Honda","1000",true,false);
        System.out.println(vehicle3.getInfo());
    }
}
