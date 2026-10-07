package java_basics;

import java.util.Scanner;

public class Project_AreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Area calculator");
            System.out.println("1.rectangle, 2.square, 3.triangle");
            System.out.println("pls provide an input as 1/2/3");

            int area = sc.nextInt();

            switch (area) {

            case 1:
                System.out.println("enter the length");
                int l = sc.nextInt();

                System.out.println("enter the breadth");
                int b = sc.nextInt();

                int c = 2 * l * b;

                System.out.println("Area of rectangle is :" + c);
                break;

            case 2:
                System.out.println("enter the side of square");
                int d = sc.nextInt();

                int e = d * d;

                System.out.println("Area of square is" + e);
                break;

            case 3:
                System.out.println("enter the breadth of triangle");
                int br = sc.nextInt();

                System.out.println("enter the hight of triangle");
                int hi = sc.nextInt();

                float at = (0.5f * br * hi);

                System.out.println(at);
                break;

            default:
                System.out.println("invalid input pls try again");
            }

        } while (true);
    }
}