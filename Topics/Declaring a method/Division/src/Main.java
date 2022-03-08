import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        if (b == 0) {
            System.out.println("Division by zero!");
            return 0.0;
        } else {
            return (double) a / b;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}