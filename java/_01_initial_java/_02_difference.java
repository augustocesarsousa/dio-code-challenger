import java.io.IOException;
import java.util.Scanner;

public class _02_difference {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diff = (a * b - c * d);

        System.out.println("DIFERENCA = " + diff);

        scanner.close();
    }
}