package Module_1.Java_Core_1_4;

import java.util.Scanner;

public class DegreeOfTwo {
    public static void main(String[] args) {
        short i;
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextShort();
        System.out.println(1 << i);
    }

    /* Авторское решение Samsung IT
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(1 << n);
    */
}