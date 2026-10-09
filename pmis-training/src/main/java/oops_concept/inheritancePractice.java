package oops_concept;

class Animal1{
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dogs extends Animal1{
    void bark(){
        System.out.println("The dog barks.");
    }
}

public class inheritancePractice{
    public static void main(String[] args){
        Dogs myDog = new Dogs();
        myDog.eat();
        myDog.bark();
    }
}