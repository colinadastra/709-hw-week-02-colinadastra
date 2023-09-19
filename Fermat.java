// Exercise 5.3

import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, n;
        System.out.println("Can you disprove Fermat's last theorem?");
        System.out.print("Provide a: ");
        a = in.nextInt();
        System.out.print("Provide b: ");
        b = in.nextInt();
        System.out.print("Provide c: ");
        c = in.nextInt();
        System.out.print("Provide n: ");
        n = in.nextInt();
        if (check(a,b,c,n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
        in.close();
    }

    private static boolean check(int a, int b, int c, int n) {
        return (n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n));
    }
}
