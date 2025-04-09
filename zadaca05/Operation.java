package zadaca05;

public abstract class Operation implements IOperation {
    protected double operand1;
    protected double operand2;

    public Operation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public abstract double compute();

    @Override
    public double compute(double a, double b) {
        this.operand1 = a;
        this.operand2 = b;
        return compute();
    }
}