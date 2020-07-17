package CityBike;

import java.util.ArrayList;

public class Station {
    private static int counter = 1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikes;



    public Station(String location) {
        this.stationID = counter++;
        this.location = location;
        this.bikes = new ArrayList<>(); //It is empty arraylist, fill later.
    }


    public String getLocation() {
        return location;
    }

    public int getStationID() {
        return stationID;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }


    public void addBike (Bike x) {
        bikes.add(x);

    }



    @Override
    public String toString() {
        return "Station{" +
                "stationID=" + stationID +
                ", location='" + location + '\'' +
                ", bikes=" + bikes +
                '}';
    }



}
