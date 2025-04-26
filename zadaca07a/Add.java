package zadaca07a;

public class Add<T extends Number> extends Operation<T> {
    public Add(T operand1, T operand2) {
        super(operand1, operand2);
    }

    @Override
    public T compute() {
        Double result = operand1.doubleValue() + operand2.doubleValue(); // unboxing
        return (T) result; // downcasting
    }
}