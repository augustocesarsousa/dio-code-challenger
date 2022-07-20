import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _09_honey {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double V, D, R, area, altura;

        while (scanner.hasNext()) {
            V = scanner.nextDouble();
            D = scanner.nextDouble();
            R = D / 2;
            area = 3.14 * (Math.pow(R, 2));
            altura = V / (area);
            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
        }
        scanner.close();
    }
}