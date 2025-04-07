package processor;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter The Number (for Factorial): ");
        int f = s.nextInt();
        Processor p = new Factorial(f);

        System.out.print("Enter The Radius (for Circle): ");
        int r = s.nextInt();
        Processor p1 = new Circle(r);

        p.process();
        p1.process();

        s.close();
    }
}
