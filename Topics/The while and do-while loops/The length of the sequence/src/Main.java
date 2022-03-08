import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int count = 0;
        while (number != 0) {
            number = scanner.nextInt();
            if (number != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
