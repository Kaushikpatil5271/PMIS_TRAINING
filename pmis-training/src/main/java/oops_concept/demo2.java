package oops_concept;



class Animal3 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog3 extends Animal3{
    @Override
    void eat() {
        System.out.println("Dog is eating");
        super.eat();
        
    }
}

public class demo2{
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();
    }
    
    
}