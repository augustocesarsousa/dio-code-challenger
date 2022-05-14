import java.io.IOException;
import java.util.Scanner;

public class _03_average {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int n = 1;
        double soma = 0.0;

        while (n > 0) {
            n = scanner.nextInt();
            if (n > 0) {
                soma += n;
                cont++;
            }
        }

        double media = soma / cont;
        System.out.println(String.format("%.2f", media));

        scanner.close();
    }
}