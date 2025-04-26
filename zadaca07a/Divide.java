package zadaca07a;

public class Divide<T extends Number> extends Operation<T> {
    public Divide(T operand1, T operand2) {
        super(operand1, operand2);
    }

    @Override
    public T compute() {
        if (operand2.doubleValue() == 0) { // unboxing
            throw new ArithmeticException("Ne dijelimo s nulom!");
        }
        Double result = operand1.doubleValue() / operand2.doubleValue(); // unboxing
        return (T) result; // downcasting
    }
}