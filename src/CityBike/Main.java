package CityBike;

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


        Station station1 = new Station("Meidling");
        Station station2 = new Station("Margareten Gurtel");
        Station station3 = new Station("Karlsplatz");

        HashMap<Integer, Station> stations = new HashMap <>();
        stations.put(station1.getStationID(),station1);
        stations.put(station2.getStationID(),station2);
        stations.put(station3.getStationID(),station3);

        station1.addBike(bike1);
        station1.addBike(bike3);
        station1.addBike(bike2);
        station2.addBike(bike4);
        station2.addBike(bike6);
        station2.addBike(bike7);
        station2.addBike(bike8);

        System.out.println(station1);

        User user1 = new User("Eva","Ynsi");
        User user2 = new User("Farzaneh","fff");
        User user3 = new User("Donya","hhh");
        User user4 = new User("Darya","BBB");

        System.out.println("\nStation one before rent");
        System.out.println(station1);
        System.out.println("\nUser one before rent");
        System.out.println(user1);


        //Renting process fails. Bike cannot be rented cuz of the status
        System.out.println("\n---------------------------------------" +
                "Failed renting process--------------------------------------------");

        user1.rentBike(bike3,station1);     //rent bike

        System.out.println("\nStation one after rent");
        System.out.println(station1);
        System.out.println("\nUser one after rent");
        System.out.println(user1);


        System.out.println("\nStation two before bike return");
        System.out.println(station2);

        user1.removeBike(station2);     //returned bike

        System.out.println("\nStation two after bike return");
        System.out.println(station2);
        System.out.println("\nUser one after bike return");
        System.out.println(user1);




        //Successful renting process.
        System.out.println("\n---------------------------------------" +
                "Successful renting process--------------------------------------------");

        user1.rentBike(bike1,station1);     //rent bike

        System.out.println("\nStation one after rent");
        System.out.println(station1);
        System.out.println("\nUser one after rent");
        System.out.println(user1);


        System.out.println("\nStation two before bike return");
        System.out.println(station2);

        user1.removeBike(station2);     //returned bike

        System.out.println("\nStation two after bike return");
        System.out.println(station2);
        System.out.println("\nUser one after bike return");
        System.out.println(user1);













    }

}
