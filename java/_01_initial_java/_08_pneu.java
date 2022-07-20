import java.io.IOException;
import java.util.Scanner;

public class _08_pneu {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println(N - M);
        scanner.close();
    }
}