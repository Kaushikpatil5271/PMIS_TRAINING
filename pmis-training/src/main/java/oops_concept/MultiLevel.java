package oops_concept;

//Multi-level inheritance
//Parent class
class Device{
 void poweron(){
     System.out.println("Device powered on..............");
 }
}

//Child class - 1
class Phone extends Device{
 void makeCall() {
	 System.out.println("Calling a number............");
 }
}

//child class - 2
class SmartPhone extends Phone{
	 void browser() {
		 System.out.println("opening browser...........");
	 }

}

public class MultiLevel{
 public static void main(String args[]){
	 SmartPhone oneplus = new SmartPhone();
	 oneplus.browser();
	 oneplus.makeCall();
	 oneplus.poweron();
	 
     
 }
}