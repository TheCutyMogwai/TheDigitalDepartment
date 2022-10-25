package Module_1.Java_Core_1_6.AdditionalTasks;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();

    int t;
    if (y < x) {
        t = x;
        x = y;
        y = t;
    }
    if (z < x) {
        t = z;
        z = y;
        y = x;
        x = t;
    }
    else if (z < y) {
        t = y;
        y = z;
        z = t;
    }
    System.out.println(x + " " + y + " " + z);
    */
}