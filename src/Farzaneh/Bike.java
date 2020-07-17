package Farzaneh;

/*
this.color = color;
this.state = state;*/

public class Bike {
    private static int counter = 1; // auto increment
    private int bikeID;
    private String state;
    private String color;

    //Constructor
    public Bike(String state, String color) {
        this.bikeID = counter++; // auto increment
        this.state = state;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeID=" + bikeID +
                ", state='" + state + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

