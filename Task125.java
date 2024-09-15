// Base class Vehicle
class Vehicle {
    // Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters for the attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Derived class Car that extends Vehicle
class Car extends Vehicle {
    // Additional attribute for Car
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        // Call the constructor of the base class (Vehicle)
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details of the car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to test the functionality
public class Task125 {
    public static void main(String[] args) {
        // Create an instance of the Car class and set values for its attributes
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        
        // Display the details of the car
        myCar.displayDetails();
    }
}

