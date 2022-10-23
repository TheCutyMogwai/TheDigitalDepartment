package Module_1.Java_Core_1_5.AdditionalTasks;

import java.util.Locale;
import java.util.Scanner;

public class Point4 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat(); y = scanner.nextFloat();
        if (y >= Math.pow(x, 2) - 2 && (y <= x || y <= -x)) System.out.println("YES");
        else System.out.println("NO");
    }

    /* Авторское решение Samsung IT
     Scanner scanner = new Scanner(System.in);
     double x = scanner.nextDouble();
     double y = scanner.nextDouble();
     System.out.print(y >= x * x - 2 && (y <= x || y <= -x)  ? "YES" : "NO");
    */
}