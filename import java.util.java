import java.util.ArrayList;
import java.util.List;

// Car class representing individual cars
class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}

// Customer class representing individual customers
class Customer {
    private String name;
    private String email;
    private double budget;

    public Customer(String name, String email, double budget) {
        this.name = name;
        this.email = email;
        this.budget = budget;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBudget() {
        return budget;
    }
}

// Dealership class representing the car dealership
class Dealership {
    private String name;
    private List<Car> inventory;

    public Dealership(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    // Method to add cars to the inventory
    public void addCar(Car car) {
        inventory.add(car);
    }

// Method to display the in
