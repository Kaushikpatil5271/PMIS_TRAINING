package java_exercise1;
import java.util.Scanner;

public class GreaterNumber {
	
	static void greater(int a ,int b) {
		if(a>b) {
			System.out.println(a+" is greater number");
		}else {
			System.out.println(b+" is greater number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the first number");
		Scanner sc =new Scanner(System.in);
		int num1 =sc.nextInt();
		
		System.out.println("enter the second number");
		int num2 =sc.nextInt();
		
		greater(num1,num2);

	}

}
