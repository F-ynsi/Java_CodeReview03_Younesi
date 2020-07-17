package CityBike;

public class User {
    private static int counter = 1;
    private int userID;
    private String name;
    private String surname;
    private Bike currentlyRentedBike;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
        userID = counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Bike getCurrentlyRentedBike() {
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
