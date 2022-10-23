package Module_1.Java_Core_1_4;

import java.util.Scanner;

public class ResetLastBits {
    public static void main(String[] args) {
        int A; short i;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt(); i = scanner.nextShort();
        A = A >> i << i;
        System.out.println(A);
    }

    /* Авторское решение Samsung IT
    int A, i;
    A = in.nextInt();
    i = in.nextInt();
    A = A >> i;
    A = A << i;
    System.out.println(A);
    */
}