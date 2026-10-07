package java_exercise1;

import java.util.Scanner;

class no_Counter {

    int positive = 0;
    int negative = 0;
    int zero = 0;

    void count(int num) {

        if (num > 0) {
            positive++;
        } else if (num < 0) {
            negative++;
        } else {
            zero++;
        }
    }
}

public class NumberCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        no_Counter obj = new no_Counter();

        System.out.println("Enter numbers one by one");
        System.out.println("Enter 'exit' to stop");

        while (true) {

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int num = Integer.parseInt(input);

            obj.count(num);
        }

        System.out.println("Positive numbers = " + obj.positive);
        System.out.println("Negative numbers = " + obj.negative);
        System.out.println("Zeros = " + obj.zero);
    }
}