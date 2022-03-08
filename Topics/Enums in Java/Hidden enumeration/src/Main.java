
public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (Secret word : Secret.values()) {
            if (String.valueOf(word).startsWith("STAR")) {
                count++;
            }
        }

        System.out.print(count);

    }
}

enum Secret {
    STAR, CRASH, START, // ...
}
