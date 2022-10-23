package Module_1.Java_Core_1_5.AdditionalTasks;

import java.util.Locale;
import java.util.Scanner;

public class Point3 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat(); y = scanner.nextFloat();
        if (y <= 2 - Math.pow(x, 2) && (y >= x || y >= 0)) System.out.println("YES");
        else System.out.println("NO");
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    System.out.print(y <= 2 - x * x && (y >= x || y >= 0)  ? "YES" : "NO");
    */
}