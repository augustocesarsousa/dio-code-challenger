import java.io.IOException;
import java.util.Scanner;

public class _11_dragon {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            int cont = 0;

            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt();
                if (A >= min && A <= max)
                    cont++;
            }
            System.out.println(cont);
        }

        scanner.close();
    }

}