package Module_1.Java_Core_1_5.AdditionalTasks;

import java.util.Locale;
import java.util.Scanner;

public class Point1 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat(); y = scanner.nextFloat();
        if (y >= Math.sqrt(4 - Math.pow(x, 2)) && y <= x && x <=2) System.out.println("YES");
        else System.out.println("NO");
    }

    /* Авторское решение Samsung IT
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    double y = in.nextDouble();
    System.out.println(x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO");
    */
}