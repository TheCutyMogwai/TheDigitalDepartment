package Module_1.Java_Core_1_4;

import java.util.Scanner;

public class PrecisePowerOfTwo {
    public static void main(String[] args) {
        int A; int i = 1;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        while (i < A) i *= 2;
        if (i == A) System.out.println(0);
        else System.out.println(-1);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println((n & (n - 1)));
    */
}