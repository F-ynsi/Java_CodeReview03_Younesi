package Farzaneh;

import java.util.HashMap;

public class Main {
        //8Object
    public static void main(String[] args) {
        Bike bike1 = new Bike("CanBeRented", "Red");
        Bike bike2 = new Bike("CanNotBeRented", "Green");
        Bike bike3 = new Bike("InService", "Yellow");
        Bike bike4 = new Bike("Discarded ", "Black");
        Bike bike5 = new Bike("CanBeRented", "Blue");
        Bike bike6 = new Bike("InService", "Orange");
        Bike bike7 = new Bike("Discarded", "Pink");
        Bike bike8 = new Bike("CanNotBeRented", "Gray");

        HashMap<Integer, Bike> bikes = new HashMap <Integer, Bike>();
        bikes.put(bike1.getBikeID(),bike1);
        bikes.put(bike2.getBikeID(),bike2);
        bikes.put(bike3.getBikeID(),bike3);
        bikes.put(bike4.getBikeID(),bike4);
        bikes.put(bike5.getBikeID(),bike5);
        bikes.put(bike6.getBikeID(),bike6);
        bikes.put(bike7.getBikeID(),bike7);
        bikes.put(bike8.getBikeID(),bike8);


        for (Integer i : bikes.keySet()) {
            System.out.println(bikes.get(i));
        }
    }

}
