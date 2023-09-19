// Exercise 5.7

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Can you form a triangle with three side lengths?");
        System.out.print("Provide side length a: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
            in.close();
            return;
        }
        a = in.nextDouble();
        System.out.print("Provide side length b: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
            in.close();
            return;
        }
        b = in.nextDouble();
        System.out.print("Provide side length c: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
            in.close();
            return;
        }
        c = in.nextDouble();
        check(a,b,c);
        in.close();
    }

    private static void check(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sorry, one of those lengths is negative or zero.");
            return;
        }
        if (a + b <= c) {
            System.out.println("You can't form a triangle with these lengths because a + b <= c.");
        } else if (b + c <= a) {
            System.out.println("You can't form a triangle with these lengths because b + c <= a.");
        } else if (a + c <= b) {
            System.out.println("You can't form a triangle with these lengths because a + c <= b.");
        } else {
            System.out.println("Sure, you can form a triangle with these lengths!");
        }
    }
}
