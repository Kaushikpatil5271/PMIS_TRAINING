package Relationships;

class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

// Car HAS-A Engine (Composition / Aggregation)
class Car {
    private Engine engine;

    Car() {
        this.engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

// ElectricCar IS-A Car (Inheritance)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging...");
    }
}

public class IsHas {

    public static void main(String[] args) {
        // HAS-A Relationship test
        Car normalCar = new Car();
        normalCar.drive();

        System.out.println("-----------------");

        // IS-A + HAS-A Relationship test
        ElectricCar tesla = new ElectricCar();
        tesla.drive();   // Inherited from Car (which uses Engine)
        tesla.charge();  // Specific to ElectricCar
    }

}
