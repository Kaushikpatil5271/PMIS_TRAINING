package Relationships;

class Address {
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress() {
        System.out.println(city + ", " + state + ", " + pincode);
    }
}

class Student {
    String name;
    int rollNumber;
    Address address; // Has-A relationship

    Student(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Student: " + name + "\nRoll No. " + rollNumber);
        System.out.println("Lives at: ");
        address.displayAddress();
    }
}

public class Has_a {

    public static void main(String[] args) {
        // Creating Address object
        Address addr = new Address("wada", "Maharashtra", 421303);
        
        // Injecting Address into Student (Composition/Aggregation - Has-A)
        Student student = new Student("kaushik", 101, addr);

        // Display details
        student.displayProfile();
    }

}