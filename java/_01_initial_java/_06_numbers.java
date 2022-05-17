import java.io.IOException;
import java.util.Scanner;

public class _06_numbers {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int pair = 0;
    int odd = 0;
    int positive = 0;
    int negative = 0;
    int number;

    for (int i = 0; i < 5; i++) {
      number = scanner.nextInt();
      if (number % 2 == 0) {
        pair++;
        if (number > 0) {
          positive++;
        } else if (number < 0) {
          negative++;
        }
      } else {
        odd++;
        if (number > 0) {
          positive++;
        } else if (number < 0) {
          negative++;
        }
      }
    }

    System.out.println(pair + " par(es)");
    System.out.println(odd + " impar(es)");
    System.out.println(positive + " positivo(s)");
    System.out.println(negative + " negativo(s)");

    scanner.close();
  }
}
