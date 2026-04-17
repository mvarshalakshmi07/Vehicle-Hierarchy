import java.util.Scanner;
class Vehicle {
    protected String brand;
    protected int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void display() {
        System.out.println("Vehicle Type: Car");
        super.display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle {
    private int engineCapacity;
    public Bike(String brand, int speed, int engineCapacity) {
        super(brand, speed);
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void display() {
        System.out.println("Vehicle Type: Bike");
        super.display();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vehicle vehicle = null;
        System.out.println("Select Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter choice: ");
        int choice = s.nextInt();
        s.nextLine();
        switch(choice) {
            case 1:
                System.out.print("Enter Car Brand: ");
                String carBrand = s.nextLine();
                System.out.print("Enter Speed (km/h): ");
                int carSpeed = s.nextInt();
                System.out.print("Enter Number of Doors: ");
                int doors = s.nextInt();
                vehicle = new Car(carBrand, carSpeed, doors);
                break;
            case 2:
                System.out.print("Enter Bike Brand: ");
                String bikeBrand = s.nextLine();
                System.out.print("Enter Speed (km/h): ");
                int bikeSpeed = s.nextInt();
                System.out.print("Enter Engine Capacity (cc): ");
                int capacity = s.nextInt();
                vehicle = new Bike(bikeBrand, bikeSpeed, capacity);
                break;
            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }
        System.out.println("--- Vehicle Details ---");
        vehicle.display(); 
        s.close();  
    }
}
