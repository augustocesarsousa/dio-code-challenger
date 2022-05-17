import java.io.IOException;
import java.util.Scanner;

public class _05_odd {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int cont = 0;

    while (cont < 6) {
      if (x % 2 != 0) {
        System.out.println(x);
        cont++;
      } else {
        x++;
        System.out.println(x);
        cont++;
      }
      x++;
    }

    scanner.close();
  }
}
