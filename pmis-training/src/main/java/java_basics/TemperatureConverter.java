package java_basics;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter temp in F");
        float f = sc.nextFloat();

        int celc = (int)(f - 32) * 5 / 9;

        System.out.println(f + " temp in celcius " + celc);
    }
}