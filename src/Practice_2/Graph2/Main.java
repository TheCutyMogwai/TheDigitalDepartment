package Practice_2.Graph2;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        if (y <= 1 && x >= 0 && ( (pow(x,2)) + pow(y,2) <= 1 || (y <= x-1) )) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}