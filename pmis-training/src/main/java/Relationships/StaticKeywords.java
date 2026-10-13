package Relationships;

// Static Variable.
class Students {
    String name;
    static String collegeName = "IIT Bombay";

    Students(String name) {
        this.name = name;
    }

    void stucol() {
        System.out.println(name + " studies in " + collegeName);
    }
}

public class StaticKeywords {

    public static void main(String[] args) {
        // Creating student instances
        Students s1 = new Students("kaushik");
        Students s2 = new Students("Rahul");

        // Calling method to display details with the shared static variable
        s1.stucol();
        s2.stucol();
    }

}