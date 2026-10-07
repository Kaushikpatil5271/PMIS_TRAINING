package java_exercise1;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class CircleCircumference {
	static void circumference(float rad) {
		float cir = 2*3.14f*rad;
		System.out.println("circumference is:"+cir);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter radius of circle");
		Scanner sc =new Scanner(System.in);
		float radius = sc.nextFloat();
		
		circumference(radius);
		
	}

}
