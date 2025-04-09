package zadaca05;

public class Add extends Operation {
    public Add(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double compute() {
        return operand1 + operand2;
    }
}