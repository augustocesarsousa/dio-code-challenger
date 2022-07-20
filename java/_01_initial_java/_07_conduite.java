import java.io.IOException;
import java.util.Scanner;

public class _07_conduite {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int r1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            System.out.println(r1 + r2);
        }
        scanner.close();
    }
}