package Module_1.Java_Core_1_5.CoreTasks;

import java.util.Locale;
import java.util.Scanner;

public class EvenMore {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        num1 = scanner.nextInt(); num2 = scanner.nextInt(); num3 = scanner.nextInt();
        if ( (num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 == 0 && num3 % 2 == 0)
                || (num2 % 2 == 0 && num3 % 2 == 0) ) System.out.println(true);
        else System.out.println(false);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    System.out.println(n1 % 2 == 0 && n2 % 2 == 0 || n1 % 2 == 0 && n3 % 2 == 0 || n2 % 2 == 0 && n3 % 2 == 0);
    */
}