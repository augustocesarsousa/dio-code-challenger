import java.io.IOException;
import java.util.Scanner;

/**
 * _12_names
 */
public class _12_names {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.nextLine();
        }

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
        scanner.close();
    }
}