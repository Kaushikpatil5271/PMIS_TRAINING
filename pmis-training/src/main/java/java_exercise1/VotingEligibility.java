package java_exercise1;
import java.util.Scanner;

public class VotingEligibility {
		static boolean check(int age) {
			if(age>18) {
				return true;
			}else {
				return false;
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		boolean result =check(age);
		
		if(result) {
			System.out.println("you are eligible for voting");
		}else {
			System.out.println("you are not eligible for voting");
		}
		
	}

}
