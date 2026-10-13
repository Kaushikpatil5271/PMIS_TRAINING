package ExceptionHandeling;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage interfaces;


        try {
//            int res = 10 / 0;
//            System.out.println(res);
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }catch(ArithmeticException k) {
        	System.out.println("arithmatic exception");
        }
        
    }
}

/*
ArithmeticException
Trying to divide an integer by zero.
10 / 0

NullPointerException
Trying to access a method or field through a null reference.
String name = null;
Calling an instance method on a null object (e.g., str.length() when str is null).
Accessing or modifying a field of a null object (e.g., user.name).
Taking the length of a null array or accessing its slots.

ArrayIndexOutOfBoundsException
Accessing an array index that doesn't exist.
int[] nums = {1, 2}; then nums[5]
*/


