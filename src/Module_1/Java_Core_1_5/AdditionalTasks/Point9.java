package Module_1.Java_Core_1_5.AdditionalTasks;

import java.util.Locale;
import java.util.Scanner;

public class Point9 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (( y <= 1 && x <= 1 && x >=0 && y >=0 ) || (Math.pow(x,2)) + Math.pow(y,2) <= 1 ) System.out.println("YES");
        else System.out.println("NO");
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    System.out.print(x >= 0 && y >= 0 && x <= 1 && y <= 1 || x * x + y * y <= 1 ? "YES" : "NO");
    */
}