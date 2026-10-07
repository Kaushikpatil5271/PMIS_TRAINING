package java_basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first no");
        int a = sc.nextInt();

        System.out.println("enter your second no");
        int b = sc.nextInt();

        System.out.println("enter your input in +,*,-,/");
        char c = sc.next().charAt(0);

        switch (c) {

        case '+':
            System.out.println(a + b);
            break;

        case '-':
            System.out.println(a - b);
            break;

        case '*':
            System.out.println(a * b);
            break;

        case '/':
            System.out.println(a / b);
            break;

        default:
            System.out.println("invalid input");
        }
    }
}