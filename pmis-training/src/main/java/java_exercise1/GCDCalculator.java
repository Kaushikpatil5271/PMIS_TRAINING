package java_exercise1;

import java.util.Scanner;

public class GCDCalculator {

    static int gcd(int a, int b) {

        while (b != 0) {

            int remainder = a % b;

            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int result = gcd(a, b);

        System.out.println("GCD = " + result);
    }
}