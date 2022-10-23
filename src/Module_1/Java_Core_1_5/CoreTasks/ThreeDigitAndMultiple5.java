package Module_1.Java_Core_1_5.CoreTasks;

import java.util.Locale;
import java.util.Scanner;

public class ThreeDigitAndMultiple5 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        x = scanner.nextInt();
        if (x >= 100 && x < 1000 && x % 5 == 0) System.out.println(true);
        else System.out.println(false);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(n > 99 && n < 1000 && n % 5 == 0);
    */
}