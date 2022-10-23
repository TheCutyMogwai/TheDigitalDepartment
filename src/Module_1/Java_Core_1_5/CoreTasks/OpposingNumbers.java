package Module_1.Java_Core_1_5.CoreTasks;

import java.util.Locale;
import java.util.Scanner;

public class OpposingNumbers {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        num1 = scanner.nextInt(); num2 = scanner.nextInt(); num3 = scanner.nextInt(); num4 = scanner.nextInt();
        if (num1 == -num2 || num1 == -num3 || num1 == -num4
                || num2 == -num3 || num2 == -num4 || num3 == -num4) System.out.println(true);
        else System.out.println(false);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    int n4 = scanner.nextInt();
    System.out.println(n1 + n2 == 0 || n1 + n3 == 0 || n1 + n4 == 0 || n2 + n3 == 0 || n2 + n4 == 0 || n3 + n4 == 0);
    */
}