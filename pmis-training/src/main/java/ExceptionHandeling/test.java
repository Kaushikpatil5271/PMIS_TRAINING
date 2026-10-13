package ExceptionHandeling;

import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        System.out.print("enter age: ");
		        Scanner sc = new Scanner(System.in);

		        int age = sc.nextInt();

		        if (age < 0) {
		            throw new IllegalArgumentException(
		                "Age cannot be negative"
		            );
		        }
		        System.out.println("Age: " + age);
		    }
}
		/*
		Excp handling
		1. try - catch
		2. finally
		3. throw
		*/

