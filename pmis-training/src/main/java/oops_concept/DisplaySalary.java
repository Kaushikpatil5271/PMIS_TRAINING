package oops_concept;

// Base class
class Employee1 {
    double salary = 30000;

    // Explicit default constructor ensures the JVM always finds it
    public Employee1() {
    }
}

// Child class
class Manager extends Employee1{
    double salary = 60000;

    public Manager() {
        super();
    }

    void displaySalary() {
        System.out.println("Manager Salary: " + salary);
        System.out.println("employee salary: " + super.salary);
    }
}

// Main class matching filename: DisplaySalary.java
public class DisplaySalary {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }
}