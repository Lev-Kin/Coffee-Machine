import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int n = scanner.nextInt();

        int count = (b - a) / n + 1;

        System.out.println(count);
    }
}