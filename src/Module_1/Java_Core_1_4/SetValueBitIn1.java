package Module_1.Java_Core_1_4;

import java.util.Scanner;

public class SetValueBitIn1 {
    public static void main(String[] args) {
        int A; short i;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt(); i = scanner.nextShort();
        A = A | (1 << i);
        System.out.println(A);
    }

    /* Авторское решение Samsung IT
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
    int i = in.nextInt();
	System.out.println(a | (1 << i));
    */
}