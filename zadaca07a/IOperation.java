package zadaca07a;

public interface IOperation<T extends Number> {
    T compute(T a, T b);
}