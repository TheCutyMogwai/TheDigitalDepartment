package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        System.out.println(max);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int max = a;
    if (b > max) {
        max = b;
    }
    if (c > max) {
        max = c;
    }
    System.out.println(max);
    */
}