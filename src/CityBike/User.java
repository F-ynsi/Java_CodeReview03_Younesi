package CityBike;

import java.util.ArrayList;

public class User {
    private static int counter = 1;
    private int userID;
    private String name;
    private String surname;
    private ArrayList<Bike>  currentlyRentedBike;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.currentlyRentedBike = new ArrayList<>();
        userID = counter++;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }


    public void rentBike(Bike b, Station s) {
        if(b.getState()== "CanBeRented") {
            s.removeBike(b);
            currentlyRentedBike.add(b);
        }
        else {
            System.out.println("\n----------------------------------------------------\n" +
                    "This bike is out of service, you cannot rent it now." +
                    "\n----------------------------------------------------\n");
        }
    }

    public void removeBike (Station s) {
       if(currentlyRentedBike.isEmpty()) {
           System.out.println("\n-----------------------------------\n" +
                   "The user has no bike at the moment." +
                   "\n-----------------------------------\n");
       }
       else{
           Bike myBike =  currentlyRentedBike.remove(0);
           s.addBike(myBike);

       }
    }



    public ArrayList<Bike> getCurrentlyRentedBike() {
        return currentlyRentedBike;

    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentlyRentedBike=" + currentlyRentedBike +
                '}';
    }
}
