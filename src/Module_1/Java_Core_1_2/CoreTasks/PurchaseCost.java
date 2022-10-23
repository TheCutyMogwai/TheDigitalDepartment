package Module_1.Java_Core_1_2.CoreTasks;

import java.util.Scanner;

public class PurchaseCost {
    public static void main(String[] args) {
        short a, n; byte b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextShort(); b = scanner.nextByte(); n = scanner.nextShort();
        int sumP = b * n % 100;
        int sumR = a * n + b * n / 100;
        System.out.println(sumR + " " + sumP);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = scanner.nextInt();
    a = (a * 100 + b) * n;
    System.out.println(a / 100 + " " + a % 100);
    */
}