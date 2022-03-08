import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        boolean check;
        if (number < 10 && number > 0) {
            check = true;
        } else {
            check = false;
        }
        System.out.println(check);
    }
}