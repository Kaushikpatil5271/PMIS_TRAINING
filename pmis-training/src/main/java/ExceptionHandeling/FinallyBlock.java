package ExceptionHandeling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        try {
		            int res = 10 / 5;
		            System.err.println(res);
		        } catch (ArithmeticException e) {
		            System.out.println("Cannot divide by 0");
		        } finally {
		            System.out.println("Finally block executed.");
		        }
		    
	}

}
