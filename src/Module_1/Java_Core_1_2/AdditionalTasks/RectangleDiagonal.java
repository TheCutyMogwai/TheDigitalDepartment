package Module_1.Java_Core_1_2.AdditionalTasks;

import java.util.Scanner;

public class RectangleDiagonal {
    public static void main(String[] args) {
        int A, B;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextShort(); B = scanner.nextShort();
        int D = A * A + B * B;
        System.out.println(D);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(a * a + b * b);
    */
}