package java_exercise1;
import java.util.Scanner;

public class OddNumberSum {
	
	static void oddSum(int n){
		int i=1;
		int sum=0;
		while (i<=n) {
			if(n%2==1) {
				sum =sum +i;
			}
			
			i++;
			
		}
		System.out.println("the addition of n odd no is:"+sum);
	
		
	}
	public static void main(String[] args) {
		
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		oddSum(a);
		
		
	}

}
