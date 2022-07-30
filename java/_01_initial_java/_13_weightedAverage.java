import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
 * seguir.
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa
 * decimal.
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo
 * que o
 * primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */

public class _13_weightedAverage {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        int cont = 0;
        List<Double> results = new ArrayList<>();

        while (cont < casos) {

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            results.add((a * 2 + b * 3 + c * 5) / 10);

            cont++;
        }

        for (Double result : results) {
            System.out.printf("%.1f\n", result);
        }
        scanner.close();
    }
}