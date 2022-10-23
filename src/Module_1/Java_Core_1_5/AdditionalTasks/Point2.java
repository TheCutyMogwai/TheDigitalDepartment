package Module_1.Java_Core_1_5.AdditionalTasks;

import java.util.Locale;
import java.util.Scanner;

public class Point2 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat(); y = scanner.nextFloat();
        if (y <= Math.sin(x) && y <= 0.5 && y >= 0 && x >= 0 && x <= Math.PI) System.out.println("YES");
        else System.out.println("NO");
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    System.out.print(y >= 0 && y <= 0.5 && x >= 0 && x <= Math.PI && y < Math.sin(x) ? "YES" : "NO");
    */
}