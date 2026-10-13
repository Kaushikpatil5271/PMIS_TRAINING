package oops_concept;

class Shape{
	String color ="red";
}

//child class 1
class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing a "+color+" circle.");
    }
}

// Child class 2
class Rectangle extends Shape{
    void drawRectangle(){
        System.out.println("Drawing a "+color+" rectangle.");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        
        c.drawCircle();
        r.drawRectangle();
    }
}