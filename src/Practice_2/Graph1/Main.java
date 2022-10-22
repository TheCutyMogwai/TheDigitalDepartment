package Practice_2.Graph1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        if (x <= 1 && y >= (1 - x) && x >= -Math.sqrt(y / 2) && y >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}