package zadaca07a;

public abstract class Operation<T extends Number> implements IOperation<T> {
    protected T operand1;
    protected T operand2;

    public Operation(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public abstract T compute();

    @Override
    public T compute(T a, T b) {
        this.operand1 = a;
        this.operand2 = b;
        return compute();
    }
}