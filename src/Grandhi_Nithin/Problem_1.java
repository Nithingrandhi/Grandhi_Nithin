package Grandhi_Nithin;

import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot Divide a number with Zero");
            return 0;
        }
        return a / b;
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Operand: ");
        double a = sc.nextDouble();

        System.out.println("Enter Second Operand: ");
        double b = sc.nextDouble();

        System.out.println("Enter Operation (Add/Sub/Multi/Div): ");
        String op = sc.next();
        op.toLowerCase();

        Calculator c = new Calculator();
        double result = 0;

        if (op.equals("add")) {
            result = c.add(a, b);
        } else if (op.equals("sub")) {
            result = c.subtract(a, b);
        } else if (op.equals("multi")) {
            result = c.multiply(a, b);
        } else if (op.equals("div")) {
            result = c.divide(a, b);
        } else {
            System.out.println("Invalid operation!");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
