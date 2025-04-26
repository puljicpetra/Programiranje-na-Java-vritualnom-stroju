package zadaca07a;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        Double a = sc.nextDouble(); // boxing

        System.out.print("Unesite drugi broj: ");
        Double b = sc.nextDouble(); // boxing

        System.out.print("Operacija (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Operation<Double> operation; // upcasting

        switch (op) {
            case '+':
                operation = new Add<>(a, b);
                break;
            case '-':
                operation = new Subtract<>(a, b);
                break;
            case '*':
                operation = new Multiply<>(a, b);
                break;
            case '/':
                operation = new Divide<>(a, b);
                break;
            default:
                System.out.println("Nepostojeca operacija.");
                sc.close();
                return;
        }

        try {
            Double result = operation.compute(); // unboxing
            System.out.println("Rez: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Greska: " + ex.getMessage());
        }

        sc.close();
    }
}