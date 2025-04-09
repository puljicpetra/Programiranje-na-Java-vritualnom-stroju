package zadaca05;

public class Divide extends Operation {
    public Divide(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double compute() {
        if (operand2 == 0) {
            throw new ArithmeticException("Ne dijelimo s nulom!");
        }
        return operand1 / operand2;
    }
}