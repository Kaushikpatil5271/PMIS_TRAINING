package java_exercise1;
import java.util.Scanner;

public class AverageCalculator {
	static void average(float num1, float num2, float num3) {
		float avg = (num1+num2+num3)/3.0f;
		System.out.println("The average of three numbers is:"+avg);
	}
	
	public static void main(String[] args){
		
		System.out.println("This is average calculator");
		System.out.println("enter your first no");
		Scanner sc= new Scanner(System.in);
		float num1 = sc.nextFloat();
		
		System.out.println("enter your second number");
		float num2 = sc.nextFloat();
		
		System.out.println("enter your third number");
		float num3 =sc.nextFloat();
		
		
		average(num1,num2,num3);
		
	}

}
