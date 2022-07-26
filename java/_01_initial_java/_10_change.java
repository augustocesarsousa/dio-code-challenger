import java.io.IOException;
import java.util.Scanner;

public class _10_change {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String msg;

        while (scanner.hasNext()) {
            int graus = scanner.nextInt();
            if (graus == 360 || graus >= 0 && graus < 90)
                msg = "Bom Dia!!";
            else if (graus >= 90 && graus < 180)
                msg = "Boa Tarde!!";
            else if (graus >= 180 && graus < 270)
                msg = "Boa Noite!!";
            else
                msg = "De Madrugada!!";
            System.out.println(msg);
        }

        scanner.close();
    }
}