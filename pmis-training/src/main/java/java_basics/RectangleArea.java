package java_basics;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        int len = sc.nextInt();

        System.out.println("Enter breadth of rectangle:");
        int br = sc.nextInt();

        int area = len * br;

        System.out.println("Area of rectangle = " + area);
    }
}