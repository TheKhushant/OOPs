package duplicate;
class Vehicle {
    String brand;
    int speed;
    
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    public void displayDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Speed: " + speed + " km/h");
    }
    
    public void move() {
        System.out.println("The vehicle is moving at " + speed + " km/h.");
    }
}

class Car extends Vehicle {
    int wheels = 4;   
    public Car(String brand, int speed) {
        super(brand, speed);
    }
    
    public void move() {
        System.out.println("The car is driving at " + speed + " km/h.");
    }
    
    public void displayWheels() {
        System.out.println("The car has " + wheels + " wheels.");
    }
}

public class Superclass {
    public static void main(String[] args) {
        Car myCar = new Car("Thar", 240);

        System.out.println("Car Details : ");
        myCar.displayDetails(); 
        myCar.move();      
        myCar.displayWheels();          
    }
}
