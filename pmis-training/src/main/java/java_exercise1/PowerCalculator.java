package java_exercise1;

import java.util.Scanner;

public class PowerCalculator {

	  static int power(int num, int pow) {

	        int result = 1;

	        for (int i = 1; i <= pow; i++) {
	            result = result * num;
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number:");
	        int num = sc.nextInt();

	        System.out.println("Enter power:");
	        int pow = sc.nextInt();

	        int result = power(num, pow);

	        System.out.println(num + " raised to power " + pow + " = " + result);
	    }

}
