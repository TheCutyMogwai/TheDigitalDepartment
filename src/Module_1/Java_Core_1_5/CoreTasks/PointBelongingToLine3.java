package Module_1.Java_Core_1_5.CoreTasks;

import java.util.Locale;
import java.util.Scanner;

public class PointBelongingToLine3 {
    public static void main(String[] args) {
        float x;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextFloat();
        if (x >= -2 && x <= 3 || x >= 6 && x <= 9) System.out.println(false);
        else System.out.println(true);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    System.out.println(!(x >= -2 && x <= 3 || x >= 6 && x <= 9));
    */
}