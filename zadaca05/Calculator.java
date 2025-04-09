package zadaca05;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        double a = sc.nextDouble();

        System.out.print("Unesite drugi broj: ");
        double b = sc.nextDouble();

        System.out.print("Odaberite operaciju (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Operation operation;

        switch (op) {
            case '+':
                operation = new Add(a, b);
                break;
            case '-':
                operation = new Subtract(a, b);
                break;
            case '*':
                operation = new Multiply(a, b);
                break;
            case '/':
                operation = new Divide(a, b);
                break;
            default:
                System.out.println("Nepostojeća operacija.");
                sc.close();
                return;
        }

        try {
            double result = operation.compute();
            System.out.println("Rezultat: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Greška: " + ex.getMessage());
        }

        sc.close();
    }
}