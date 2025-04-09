package zadaca01a;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        if (args.length > 0) {
            System.out.println("Neki argument: " + args[0]);
        }
    }
}