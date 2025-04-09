package zadaca05;

public class Subtract extends Operation {
    public Subtract(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double compute() {
        return operand1 - operand2;
    }
}