package oops_concept;

class Car {
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand, int speed) {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    // method - 1
    void displayInfo() {
        System.out.println(Brand + "\n" + color + "\n" + speed);
    }

    // method - 2
    void accelerate(int incr) {
        int or_speed = speed;
        speed += incr;

        System.out.println("Original Speed: " + or_speed);
        System.out.println(Brand + " accelerated by " + speed + " Km/hr");
    }
}

public class test {
    public static void main(String[] args) {
        Car c1 = new Car("black", "Buggati", 700);
        c1.displayInfo();
        c1.accelerate(50);
    }
}