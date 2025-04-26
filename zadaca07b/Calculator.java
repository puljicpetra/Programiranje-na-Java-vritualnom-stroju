package zadaca07b;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        double a = sc.nextDouble(); // automatski boxing double -> Double

        System.out.print("Unesite drugi broj: ");
        double b = sc.nextDouble(); // autom. boxing

        System.out.print("Operacija (+, -, *, /): ");
        char op = sc.next().charAt(0);

        IOperation operation; // sucelje za operaciju

        switch (op) {
            case '+':
                // Lambda add
                operation = (x, y) -> x + y;
                break;
            case '-':
                // Lambda subtract
                operation = (x, y) -> x - y;
                break;
            case '*':
                // Lambda multiply
                operation = (x, y) -> x * y;
                break;
            case '/':
                // Anon klasa za divide
                operation = new IOperation() {
                    @Override
                    public double compute(double x, double y) {
                        if (y == 0) {
                            throw new ArithmeticException("Ne dijelimo s 0!");
                        }
                        return x / y;
                    }
                };
                break;
            default:
                System.out.println("Nepostojeca operacija.");
                sc.close();
                return;
        }

        try {
            double res = operation.compute(a, b);
            System.out.println("Rez: " + res);
        } catch (ArithmeticException ex) {
            System.out.println("Greška: " + ex.getMessage());
        }

        sc.close();
    }
}