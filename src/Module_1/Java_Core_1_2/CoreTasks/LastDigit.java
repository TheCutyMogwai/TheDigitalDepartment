package Module_1.Java_Core_1_2.CoreTasks;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println(x % 10);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int a;
    a = scanner.nextInt();
    System.out.println(a % 10);
    */
}